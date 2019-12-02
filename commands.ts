const login = (username?: any, password?: any ) => {

    if (!username && !password){
 
           cy.fixture("Users").then((credentials)=>{   
            
            cy.get("#email").type(credentials.email).should('have.value',credentials.email)
            cy.get("#password").type(credentials.password)
            })
            

    }else{
        cy.get("#email").type(username).should('have.value',username)
        cy.get("#password").type(password);
    }
    cy.get("button[data-disable-with='Signing in...']").click()
    cy.contains('h2','Associated Business Units').should('be.visible')

}

declare namespace Cypress {
    interface Chainable<Subject> {
      /**
       * Logs into your application with the given email and password.
       * @param {any} username The email to log in with
       * @param {any} password The password to log in with
       */
      login(username ?: any, password ?: any): Chainable<any>
  
    }
  }
  Cypress.Commands.add('login',login)