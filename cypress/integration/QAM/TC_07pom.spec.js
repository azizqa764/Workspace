import Login from '../pageObjects/login'

describe('Login',function(){
    const login = new Login()

    it('sign in',function(){
        cy.visit('https://react-redux.realworld.io/#/login?_k=o5cbo8')
        login.email().type('zeezaiz@yahoo.com')
        login.password().type('Playstation786')
        login.signInButton().should('be.visible').click()

    })