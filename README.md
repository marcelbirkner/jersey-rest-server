[![Build Status](https://buildhive.cloudbees.com/job/marcelbirkner/job/jersey-rest-server/badge/icon)](https://buildhive.cloudbees.com/job/marcelbirkner/job/jersey-rest-server/)

# Overview

This Github project contains examples, how to create annotated REST Services. The following examples are provided:

- HTTP Methods used: @GET, @POST, @PUT, @DELETE
- MediaType: Application/JSON
- Path configuration: @Path

The REST Services are automatically documented using Enunciate (http://enunciate.codehaus.org/). 
This has the advantage to keep the source code and documentation

## Example

 
```
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserService {

	...

	@GET
	@Path("/{userId}")
	public User getUserById(@PathParam("userId") String userId) {
		...
	}

	@POST
	public User createUser(User user) {
		...
	}
```
	
## Technologies used

- Maven 2.2.1 (Build tool) 
- Java 1.7
- Jersey 6 (JAX-RS)
- Jetty 6 (Server)
- Enunciate 1.28 (API Documentation)


# Enunciate Integration

To automatically document the REST endpoints and the data model, i added Enunciate from Codehaus to the maven configuration. 
In order to generate and view the Enunciate documentation follow these steps. Enunicate parses the JAX-WS/RS annotation and JavaDoc 
to generate the REST API. This way you keep the documentation and source code in one location.

```
mvn install
mvn jetty:run-exploded
```

You can find the Enunciate under: http://localhost:8080/server-example/

## Enunciate Screenshots

<img src="screenshots/1-Startpage.png?raw=true" width="250px"/>
<img src="screenshots/2-UserService.png?raw=true" width="250px"/><br>
<img src="screenshots/3-User-json.png?raw=true" width="250px"/>
<img src="screenshots/4-User-details.png?raw=true" width="250px"/>

# REST Server

You can run the RESTful Server using <b>jetty:run</b>. After that you can use curl or your browser to test the different services.

## Automatic smoketests

Use *smoketests/run-smoketests.sh* to execute a list of smoketests, against the REST Services.

## Manual tests with curl

Here are a couple of test cases you can try locally on your maschine. All you need is a  <b>shell</b> with <b>curl</b> installed.

### Ping Service

*1. Request: Plain Text*
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

*1. Response*
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/plain
Server: Jetty(6.1.26)
```

*2. Request: XML*
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

*2. Response*
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/xml
Server: Jetty(6.1.26)
```

*3. Request: HTML*
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

*3. Response*
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/html
Server: Jetty(6.1.26)
```

*4. Request: Plain Text*
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

*4. Response*
```
Ping: System OK
```

*5. Request: XML*
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

*5. Response*
```
<?xml version="1.0"?><ping>Ping: System OK</ping>
```

*6. Request: HTML*
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

*6. Response*
```
<html><title>Ping: System OK</title><body><h1>Ping: System OK</h1></body></html> 
```

### Customer Service

*7. Request: Get Customer with Id 11 (does not exist in test data)*
```
curl http://localhost:8080/server-example/rest/customers/11
```

*7. Response*
```
Customer, 11, is not found
```

*8. Request*
```
curl -I http://localhost:8080/server-example/rest/customers/11
```

*8. Response*
```
HTTP/1.1 404 Not Found
Content-Length: 1397
Content-Type: text/html; charset=iso-8859-1
Cache-Control: must-revalidate,no-cache,no-store
Server: Jetty(6.1.26)
```

*9. Request: Get existing Customer*
```
curl  http://localhost:8080/server-example/rest/customers/1
```

*9. Response*
```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<customer>
  <customerId>1</customerId>
  <dateOfBirth>2012-08-10T16:14:05.526+02:00</dateOfBirth>
  <firstName>firstName-1</firstName>
  <lastName>lastName-1</lastName>
</customer>
```
