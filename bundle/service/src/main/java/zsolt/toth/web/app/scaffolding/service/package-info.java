/**
 * Behaviour of the services are defined in the core module.
 * This module contains their implementation so the definition and implementation are separated.
 * So this module contains the business logic and realizes transactions, logging and other processes.
 * Activity and Sequence diagrams can help you to model the business logic.
 *
 * These services covers most of the functional requirements of the system.
 * In addition, they can implement high level validation, audit log and other features.
 * Authentication and Authorization should be delegated to other module due to two reasons.
 * Firstly, it makes the service module simpler thus it facilitates the testing.
 * Secondly, security is a unique and complex area of software engineering.
 * Hence, security issues should be limited to the entry point of the system which is the controller module.
 *
 *
 * The service module should be limited to the dynamic behaviour of the system.
 * It has to record, query and process data from a persistent storage but it should not depend on their implementation.
 * So the service module implements the service interfaces (defined in the core) and define Data Access Objects.
 * DAOs are defined in the dao package of the service module.
 *
 */
package zsolt.toth.web.app.scaffolding.service;