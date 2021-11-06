describe("Login", function () {

    Cypress.config('pageLoadTimeout',10000)
    before(function () {
     cy.Signin()
    });
  
    //2ndtest cases
    it("create a new post", function () {
      // cy will come to this locator and search for its children
      cy.get("ul.navbar-nav").children().as('menu')
      cy.get('@menu').contains("New Post").click();
      cy.hash().should("include", "#/editor");
  
      cy.get("form").within(($form) => {
        cy.get('input').first().type("Test");
        cy.get('input').eq(1).type("Test1");
        cy.get('textarea').last().type("Test2");
        cy.contains("Publish Article").click();
      });
      cy.url().should("include", "article");
    });
  
    it("Mark-unmark as favourite", function () {
      cy.get("ul.navbar-nav").children().contains('zeezaiz').click()
      cy.contains("My Articles").should("be.visible")
      cy.get('.ion-heart').first().click()
      cy.contains("Favorited Articles").click()
      cy.url().should("include", "favorites")
      cy.get('.btn-primary').first().then(($fav) =>{
         return $fav.text()
      
      }).as('favCount')
      cy.get('@favCount').then(($cnt) => {
          expect(parseInt($cnt)).to.eq(1)
      })
      cy.get('.btn-primary').first().click()
      cy.reload()
      cy.contains('No articles are here... yet.').should('be.visible')
      cy.go("back")
    })
  })
  