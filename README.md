<h2>Start Server</h2>

You can run the RESTful Server using <b>jetty:run</b>. After that you can use curl or your browser to test the different services.

<h3>Manual tests with curl</h3>

Request:
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/plain
Server: Jetty(6.1.26)
```

Request:
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/xml
Server: Jetty(6.1.26)
```


Request:
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/html
Server: Jetty(6.1.26)
```



Request:
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

Response
```
Ping: System OK

Request:
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

Response
```
<?xml version="1.0"?><ping>Ping: System OK</ping>
```



Request:
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

Response
```
<html><title>Ping: System OK</title><body><h1>Ping: System OK</h1></body></html> 
```

<h4>Customer Service</h4>

Request:
```
curl http://localhost:8080/server-example/rest/customers/11
```

Response
```
Customer, 11, is not found
```

Request:
```
curl -I http://localhost:8080/server-example/rest/customers/11
```

Response
```
HTTP/1.1 404 Not Found
Content-Length: 1397
Content-Type: text/html; charset=iso-8859-1
Cache-Control: must-revalidate,no-cache,no-store
Server: Jetty(6.1.26)
```


