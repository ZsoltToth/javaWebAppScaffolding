/**
 * Controller module defines the entry point of the system.
 * It is reliable for data conversion, validation, sanitizing, access control and service invocation.
 *
 * Controller maps methods URL patterns.
 * The mapped methods should process the HTTP requests in four major steps
 * First, it converts the sent (text) data into binary objects
 * Then, it invokes the corresponding service,
 * Next it handles the exception if any occurred.
 * Finally, it converts the result into text and send back the response.
 *
 * Messages of the controller are called Data Transfer Objects.
 * DTOs are usually complex data structures, beans and created to simplify the communication with the controller.
 * DTOs may contain the data of multiple business object defined in the core module.
 * The business object can contain sensitive data which should be filtered from the DTO.
 * DTOs are beans so there are tools for their marshalling.
 * The business objects should not be beans.
 *
 * DTOs are usually generated objects.
 * You can define them with XSD and use XJC to create your DTOs.
 * XSD facilitate the communication with other developers and allow others to communicate with your system.
 * It is part of the WSDL files too.
 *
 * DTOs are processed by the controller.
 * The controller should extract the business object from the DTO and validate them.
 * Sanitizing is a high level validation and it is always necessary because the clients input is unreliable.
 *
 * Security is also part of the controller module.
 * You can give check the users permissions here and decide whether they can use a service or not.
 * From the point of view of testing, you should create two kind of tests.
 * First, you have to test your controllers, service invocation without security.
 * Secondly, you have to check the permissions and the security.
 *
 */
package zsolt.toth.web.app.scaffolding.controller;