/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api

import java.text.SimpleDateFormat

import org.openapitools.client.model.User
import org.openapitools.client.{ApiInvoker, ApiException}

import collection.mutable
import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart
import com.wordnik.swagger.client._
import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import java.net.URI
import java.io.File
import java.util.Date
import java.util.TimeZone
import javax.ws.rs.core.MediaType

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.collection.mutable.HashMap
import scala.util.{Failure, Success, Try}

import org.json4s._

class UserApi(
  val defBasePath: String = "http://petstore.swagger.io/v2",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new UserApiAsyncHelper(client, config)

  /**
   * Create user
   * This can only be done by the logged in user.
   *
   * @param user Created user object 
   * @return void
   */
  def createUser(user: User) = {
    val await = Try(Await.result(createUserAsync(user), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create user asynchronously
   * This can only be done by the logged in user.
   *
   * @param user Created user object 
   * @return Future(void)
   */
  def createUserAsync(user: User) = {
      helper.createUser(user)
  }

  /**
   * Creates list of users with given input array
   * 
   *
   * @param user List of user object 
   * @return void
   */
  def createUsersWithArrayInput(user: List[User]) = {
    val await = Try(Await.result(createUsersWithArrayInputAsync(user), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Creates list of users with given input array asynchronously
   * 
   *
   * @param user List of user object 
   * @return Future(void)
   */
  def createUsersWithArrayInputAsync(user: List[User]) = {
      helper.createUsersWithArrayInput(user)
  }

  /**
   * Creates list of users with given input array
   * 
   *
   * @param user List of user object 
   * @return void
   */
  def createUsersWithListInput(user: List[User]) = {
    val await = Try(Await.result(createUsersWithListInputAsync(user), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Creates list of users with given input array asynchronously
   * 
   *
   * @param user List of user object 
   * @return Future(void)
   */
  def createUsersWithListInputAsync(user: List[User]) = {
      helper.createUsersWithListInput(user)
  }

  /**
   * Delete user
   * This can only be done by the logged in user.
   *
   * @param username The name that needs to be deleted 
   * @return void
   */
  def deleteUser(username: String) = {
    val await = Try(Await.result(deleteUserAsync(username), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete user asynchronously
   * This can only be done by the logged in user.
   *
   * @param username The name that needs to be deleted 
   * @return Future(void)
   */
  def deleteUserAsync(username: String) = {
      helper.deleteUser(username)
  }

  /**
   * Get user by user name
   * 
   *
   * @param username The name that needs to be fetched. Use user1 for testing. 
   * @return User
   */
  def getUserByName(username: String): Option[User] = {
    val await = Try(Await.result(getUserByNameAsync(username), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get user by user name asynchronously
   * 
   *
   * @param username The name that needs to be fetched. Use user1 for testing. 
   * @return Future(User)
   */
  def getUserByNameAsync(username: String): Future[User] = {
      helper.getUserByName(username)
  }

  /**
   * Logs user into the system
   * 
   *
   * @param username The user name for login 
   * @param password The password for login in clear text 
   * @return String
   */
  def loginUser(username: String, password: String): Option[String] = {
    val await = Try(Await.result(loginUserAsync(username, password), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Logs user into the system asynchronously
   * 
   *
   * @param username The user name for login 
   * @param password The password for login in clear text 
   * @return Future(String)
   */
  def loginUserAsync(username: String, password: String): Future[String] = {
      helper.loginUser(username, password)
  }

  /**
   * Logs out current logged in user session
   * 
   *
   * @return void
   */
  def logoutUser() = {
    val await = Try(Await.result(logoutUserAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Logs out current logged in user session asynchronously
   * 
   *
   * @return Future(void)
   */
  def logoutUserAsync() = {
      helper.logoutUser()
  }

  /**
   * Updated user
   * This can only be done by the logged in user.
   *
   * @param username name that need to be deleted 
   * @param user Updated user object 
   * @return void
   */
  def updateUser(username: String, user: User) = {
    val await = Try(Await.result(updateUserAsync(username, user), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Updated user asynchronously
   * This can only be done by the logged in user.
   *
   * @param username name that need to be deleted 
   * @param user Updated user object 
   * @return Future(void)
   */
  def updateUserAsync(username: String, user: User) = {
      helper.updateUser(username, user)
  }

}

class UserApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createUser(user: User)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[User]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (user == null) throw new Exception("Missing required parameter 'user' when calling UserApi->createUser")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createUsersWithArrayInput(user: List[User])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[User]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/createWithArray"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (user == null) throw new Exception("Missing required parameter 'user' when calling UserApi->createUsersWithArrayInput")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createUsersWithListInput(user: List[User])(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[List[User]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/createWithList"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (user == null) throw new Exception("Missing required parameter 'user' when calling UserApi->createUsersWithListInput")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteUser(username: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/{username}")
      replaceAll("\\{" + "username" + "\\}", username.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling UserApi->deleteUser")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getUserByName(username: String)(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user/{username}")
      replaceAll("\\{" + "username" + "\\}", username.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling UserApi->getUserByName")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def loginUser(username: String,
    password: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/user/login"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling UserApi->loginUser")

    if (password == null) throw new Exception("Missing required parameter 'password' when calling UserApi->loginUser")

    queryParams += "username" -> username.toString
    queryParams += "password" -> password.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def logoutUser()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/logout"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateUser(username: String,
    user: User)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[User]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/{username}")
      replaceAll("\\{" + "username" + "\\}", username.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling UserApi->updateUser")

    if (user == null) throw new Exception("Missing required parameter 'user' when calling UserApi->updateUser")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(user))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}