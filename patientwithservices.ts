export const services = () =>{

  

 cy.get(".patient-service-action .epic-button").click()
  cy.get(".epic-view-text .wide [name='serviceType-select-input-wide']").click()
  cy.contains('.serviceType-select-dropdown-wide .el-select-dropdown__wrap .el-scrollbar__view .el-select-dropdown__item','Hospital').click()
  
  cy.get(".epic-view-text .wide [name='facility-select-input-wide']").click()
  cy.contains('.facility-select-dropdown-wide .epic-text','St John Of God Hospital Murdoch').click()
  cy.get(".el-select [name='ward-select-input-wide']").click()
  cy.contains('.ward-select-dropdown-wide .el-select-dropdown__list .epic-text','Bridget Clancy').click()
  cy.contains('.vue-dialog-footer .btn-action','Add').click()

  //it('Service information',() => {
   
  cy.get(".epic-input .input-field-wrapper [name='Room Number']").type("13")
  cy.get(".input-field-wrapper [placeholder='URN (Hospital)']").type("999999")
  cy.get(".epic-search-field [name='healthfundId']").type("Bupa HI Pty Ltd")
  cy.get(".input-field-wrapper [name='Cover level']").type("full cover")
  cy.get(".input-field-wrapper [name='Membership Number']").type("ABC123")
  cy.get(".el-date-editor .el-input__inner").click()
  cy.contains('.el-date-table .el-date-table__row .available','2').click()
  cy.get(".right-buttons .epic-button").click()
  cy.get(".wide .el-input--prefix #select-indigenous-status").click()
 
   
 // })
  
//it('Additional information & Save Patient', () => {
        
   cy.contains('.patient-identification-select-dropdown-wide .el-scrollbar__wrap .el-select-dropdown__item','No').click()
  cy.get(".epic-form-group__field .epic-select-container .wide #select-south-sea-islander-status").click()
  cy.contains('.patient-islanderStatus-select-dropdown-wide .el-select-dropdown__list .epic-text','No').click()
  cy.get(".right-buttons [type='button']").click()
 //})
}
