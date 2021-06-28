describe("Login", function () {
  it("sign in", function () {
    cy.visit("https://react-redux.realworld.io/#/login?_k=o5cbo8");
    cy.title().should("eq", "Conduit");
    cy.location("protocol").should("eq", "https:");
    cy.get("form").within(($form) => {
      cy.get('input[type="email"]').type("zeezaiz@yahoo.com");
      cy.get('input[type="password"]').type("Playstation786");
      cy.get(".btn").contains("Sign in").should("be.visible").click();
    });
    cy.contains('Your Feed', { timeout: 10000 }).should("be.visible");
  });

  //2ndtest cases
  it("create a new post", function () {
    // cy will come to this locator and search for its children
    cy.get("ul.navbar-nav").children().contains("New Post").click();
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
    cy.get('.ion-heart').first().click()
    cy.reload()
    cy.contains('No articles are here... yet.').should('be.visible')
    cy.go("back")
  });
});