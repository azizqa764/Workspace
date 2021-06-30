class login {
    email() {
       return  cy.get('input[type="email"]')
    }

    password() {
        cy.get('input[type="password"]')
    }

    signInButton() {
        cy.get('.btn').contains('Sign in')
    }
}

export default login