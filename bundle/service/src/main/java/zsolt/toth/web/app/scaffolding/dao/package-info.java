/**
 * Service module implements the dynamic behaviour of the system and define Data Access Objects for storage.
 * DAOs separate technologies therefore limit the scope of techniques, technologies and tools.
 * DAOs contains CRUD methods which are the CREATE, READ, UPDATE, DELETE.
 * These generic methods allow the recording, querying and modification of the records without knowledge of their implementation.
 *
 * DAOs are usually mandatory dependencies.
 * So they should be injected into the services objects via constructor.
 * In the component tests of the service module, these DAOs should be mocked.
 */
package zsolt.toth.web.app.scaffolding.dao;