/**
 * The model object contains the description of the business models.
 * These classes are defined during the design and describe entities of your system.
 * Business objects has their own data structure and behavior.
 * They can be complex structures and they are reliable for their own validation.
 * In addition, during their design you should keep in mind the principles of object oriented design.
 *
 * Business object can be compared to relational tables and DTOs.
 * A relational table defines only the data structure but business objects has their own behavior.
 * Moreover, relational tables depend on a specific DMBS while business objects should be common in the system.
 * The main difference between business objects and DTOs is that business objects should not be beans.
 * In addition, DTOs are created for message passing between two systems in a common (readable) way
 * while business objects are limited to a single system and may contain sensitive data.
 *
 * You can organize your model objects into packages if you want.
 * It is a good idea to separate your custom exceptions to another package.
 */
package zsolt.toth.web.app.scaffolding.core.model;