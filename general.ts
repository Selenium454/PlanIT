
export const login = (username?: any, password?: any ) => {

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
