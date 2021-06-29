import 'cypress-file-upload';

Cypress.Commands.add("Signin", () => {
    cy.visit('https://react-redux.realworld.io/#/login?_k=ib9g0c');
    cy.title().should("eq", "Conduit");
    cy.location("protocol").should("eq", "https:");
    cy.get("form").within(($form) => {
      cy.get('input[type="email"]').type("zeezaiz@yahoo.com");
      cy.get('input[type="password"]').type("Playstation786");
      cy.get(".btn").contains("Sign in").should("be.visible").click();
    });
    cy.contains('Your Feed', { timeout: 10000 }).should("be.visible");
}) 