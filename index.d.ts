/// <reference types="cypress" />

export {};

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

