<h2>Start Server</h2>

You can run the RESTful Server using <b>jetty:run</b>. After that you can use curl or your browser to test the different services.

<h3>Manual tests with curl</h3>

1. Request:
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

1. Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/plain
Server: Jetty(6.1.26)
```

2. Request:
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

2. Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/xml
Server: Jetty(6.1.26)
```


3. Request:
```
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

3. Response
```
HTTP/1.1 200 OK
Content-Length: 0
Content-Type: text/html
Server: Jetty(6.1.26)
```



4. Request:
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
```

4. Response
```
Ping: System OK

5. Request:
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
```

5. Response
```
<?xml version="1.0"?><ping>Ping: System OK</ping>
```



6. Request:
```
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
```

6. Response
```
<html><title>Ping: System OK</title><body><h1>Ping: System OK</h1></body></html> 
```

<h4>Customer Service</h4>

7. Request:
```
curl http://localhost:8080/server-example/rest/customers/11
```

7. Response
```
Customer, 11, is not found
```

8. Request:
```
curl -I http://localhost:8080/server-example/rest/customers/11
```

8. Response
```
HTTP/1.1 404 Not Found
Content-Length: 1397
Content-Type: text/html; charset=iso-8859-1
Cache-Control: must-revalidate,no-cache,no-store
Server: Jetty(6.1.26)
```


