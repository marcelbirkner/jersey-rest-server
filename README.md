<h2>Start Server</h2>

You can run the RESTful Server using <b>jetty:run</b>. After that you can use curl or your browser to test the different services.

<h2>Technologies used</h2>

- Maven 3 (Build tool) 
- Java 6
- Jersey 6 (JAX-RS)
- Jetty 6 (Server)

<h2>Manual tests with curl</h2>

Here are a couple of test cases you can try locally on your maschine. All you need is a  <b>shell</b> with <b>curl</b> installed.

<h3>Ping Service </h3>

1.Request: Plain Text
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

1.Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/plain
Server: Jetty(6.1.26)
```

2.Request: XML
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

2.Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/xml
Server: Jetty(6.1.26)
```

3.Request: HTML
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

3.Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/html
Server: Jetty(6.1.26)
```

4.Request: Plain Text
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

4.Response
```
Ping: System OK
```

5.Request: XML
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

5.Response
```
<?xml version="1.0"?><ping>Ping: System OK</ping>
```

6.Request: HTML
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

6.Response
```
<html><title>Ping: System OK</title><body><h1>Ping: System OK</h1></body></html> 
```

<h4>Customer Service</h4>

7.Request: Get Customer with Id 11 (does not exist in test data)
```
curl http://localhost:8080/server-example/rest/customers/11
```

7.Response
```
Customer, 11, is not found
```

8.Request
```
curl -I http://localhost:8080/server-example/rest/customers/11
```

8.Response
```
HTTP/1.1 404 Not Found
Content-Length: 1397
Content-Type: text/html; charset=iso-8859-1
Cache-Control: must-revalidate,no-cache,no-store
Server: Jetty(6.1.26)
```

9.Request: Get existing Customer
```
curl  http://localhost:8080/server-example/rest/customers/1
```

9.Response
```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<customer>
  <customerId>1</customerId>
  <dateOfBirth>2012-08-10T16:14:05.526+02:00</dateOfBirth>
  <firstName>firstName-1</firstName>
  <lastName>lastName-1</lastName>
</customer>
```
