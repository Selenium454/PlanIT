/// <reference types="Cypress" />

import { delay } from "cypress/types/bluebird"
import {login} from './../support/patientcreation/general'
import {patient} from './../support/patientcreation/patientregister'
import {services} from './../support/patientcreation/patientwithservices'

context('Validating login functionality', () => {
    before(() => {
      cy.visit('https://qa.epicdigitalau.com/auth/login#/')
    })
  
    // https://on.cypress.io/interacting-with-elements
    var username: string 
    var password: string
    var first:string
    var last : string

    it('Verify login for correct credentials', () => {
      
      cy.fixture('Users').then((cread) =>{
          username = cread.username
          password = cread.password
          
        })
        login(username,password)
        patient('hello','ausauto')
        // it('Verify patient first and lastname', () => {
        //   cy.fixture('patientnames').then((names) =>{
        //     first = names.firstname
        //     last = names.lastname
        //   })
        //   patient()
        //patient(first,last)
       
    cy.contains('.right-buttons [type="button"]','Next').click()
      
    services()

    
  })

    })

