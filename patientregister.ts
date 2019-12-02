
export const patient = (firstname:string ,lastname:string) =>{

   
    cy.get(".link-create-customer").click()
     cy.contains('span','Personal Details').should('be.visible')
     cy.get(".wide .el-input #select-title").click()
     cy.contains('.patient-title-select-dropdown-wide .el-scrollbar__view .el-select-dropdown__item .epic-text','Mrs').click()

     //.patient-title-select-dropdown-wide .el-scrollbar__view .el-select-dropdown__item .epic-text:nth-child(1)
     
    cy.get("#txt-firstname").type(firstname).should('have.value',firstname)
    cy.get("#txt-surname").type(lastname).should('have.value',lastname)
    cy.get('#txt-dob').type("03/02/2018")
    cy.get("[name='patient-gender'").check('male').should('be.checked')
    cy.get("#country").click()
    cy.get("div[class*='country-select-dropdown'][style*='position: absolute']").contains('span','At sea').click()
    cy.get("#street").type('27 station road,indooroopilly')
    cy.get("#suburb").type('Indooroopilly')
    cy.get(".inner-container [type='button']").click()
    cy.wait(2000)
}