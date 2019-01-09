/**
 * The dao module contains a specific implementation of the DAOs defined in the service module.
 * For different technologies, you can implement different dao modules.
 * For example, you want to support MySQL and Oracle as a database then you just create a dao-mysql and a dao-oracle module and implement the interfaces.
 * Because the DAOs and the services are loosely coupled, you can change the DBMS behind your system with some simple configuration.
 * This configuration does not need the modification of the source of the service module.
 *
 * When we are talking about storage, we mean databases.
 * So it is important to mention alternatives.
 * File System could be a good choice for a small system but with a lot of binary files but it could lead to security issues.
 * XML was once popular but we are using it as a configuration file mostly.
 * NoSQL solutions, such as MongoDB, are gaining popularity but you have to implement some base algorithms.
 * You may not stick to a single technology.
 *
 * The other great advantage of the dao module is the hiding of technical details.
 * So you can use any technology to access your storage.
 * These technologies should be available only in this module.
 */
package zsolt.toth.web.app.scaffolding.dao;