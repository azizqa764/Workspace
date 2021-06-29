Given('I open conduit login page',()=> {
    cy.visit('https://react-redux.realworld.io/#/login?_k=o5cbo8')
})

when('I type in username and pasword', ()=>{ 
    cy.get('input[type="email"]').type('zeezaiz@yahoo.com')
    cy.get('input[type="password"]').type('Playstation786')
})

when('I click on sign in button ', ()=> {
    cy.get('.btn').contains('Sign in').should('be.visible').click()
})

Then('your feed should be shown', ()=> {
    cy.contains('your feed',{timeout:10000}).should('be.visible')
})