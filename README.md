<h2>Start Server</h2>

You can run the RESTful Server using <b>jetty:run</b>. After that you can use curl or your browser to test the different services.

<h3>Manual tests with curl</h3>

curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/plain
Server: Jetty(6.1.26)

curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/xml
Server: Jetty(6.1.26)

curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/html
Server: Jetty(6.1.26)

curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
Ping: System OK

curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
<?xml version="1.0"?><ping>Ping: System OK</ping>

curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
<html><title>Ping: System OK</title><body><h1>Ping: System OK</h1></body></html> 

<h4>Customer Service</h4>


curl http://localhost:8080/server-example/rest/customers/11
Customer, 11, is not found

curl -I http://localhost:8080/server-example/rest/customers/11
HTTP/1.1 404 Not Found
Content-Length: 1397
Content-Type: text/html; charset=iso-8859-1
Cache-Control: must-revalidate,no-cache,no-store
Server: Jetty(6.1.26)


