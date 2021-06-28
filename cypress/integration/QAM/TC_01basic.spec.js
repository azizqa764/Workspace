describe('Login',function(){
    it('sing in',function(){

        cy.visit('https://react-redux.realworld.io/#/login?_k=o5cbo8')
        cy.title().should('eq','Conduit')
        cy.location('protocol').should('eq','https:')
        cy.get('input[type="email"]').type('zeezaiz@yahoo.com')
        cy.get('input[type="password"]').type('Playstation786')
        cy.get('.btn').contains('Sign in').should('be.visible').click()
        cy.contains('your feed',{timeout:10000}).should('be.visible')

    })

    //2ndtest cases 
    it('create a new post',function(){
     cy.contains('New Post').click()
     cy.hash().should('include','#/editor')
     cy.get('input[placeholder="Article Title"]').type('test')
     cy.get('input[placeholder="What\'s this article about?"]').type('test1')
     cy.get(':nth-child(3) > .form-control').type('test2')
     cy.contains('Publish Article').click()
     cy.url().should('include','article')

    })

    it('Mark-unmark as favourite',function(){
        cy.get('.nav-link').contains('zeezaiz').click()
        cy.contains('My Articles').should('be.visible')
        cy.get('.ion-heart').click()
        cy.contains('Favorited Articles').click()
        cy.url().should('include','favorites')
        cy.get('.ion-heart').click()
        cy.reload()
        cy.contains('No articles are here... yet.').should('be.visible')
        cy.go('back')
    })
})