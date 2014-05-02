#!/bin/sh

echo "--------------------------------------------------------------------------"
echo "Running Smoketests"
echo "--------------------------------------------------------------------------"
echo ""
echo "=========================================================================="
echo "Ping Service"
echo "=========================================================================="
echo ""
echo "--------------------------------------------------------------------------"
echo "Test Response Header for different content-types, expect HTTP 200"
echo "-------------------------------------"
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
echo "-------------------------------------"
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
echo "-------------------------------------"
curl -I http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 

echo ""
echo "--------------------------------------------------------------------------"
echo "Test Response Body for different content-types"
echo "--------------------------------------------------------------------------"
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/plain' 
echo ""
echo "-------------------------------------"
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/xml' 
echo ""
echo "-------------------------------------"
curl http://localhost:8080/server-example/rest/ping/ -H'Accept:text/html' 
echo ""

echo ""
echo "=========================================================================="
echo "Customer Service"
echo "=========================================================================="
echo ""
echo "--------------------------------------------------------------------------"
echo "Test existing Customer"
echo "--------------------------------------------------------------------------"
curl http://localhost:8080/server-example/rest/customers/1
echo ""
echo "-------------------------------------"
curl -I http://localhost:8080/server-example/rest/customers/1

echo ""
echo "--------------------------------------------------------------------------"
echo "Test non existing Customer"
echo "--------------------------------------------------------------------------"
curl http://localhost:8080/server-example/rest/customers/11
echo ""
echo "-------------------------------------"
curl -I http://localhost:8080/server-example/rest/customers/11

echo ""
echo "=========================================================================="
echo "Status Service"
echo "=========================================================================="
echo ""
echo "--------------------------------------------------------------------------"
echo "Check web application status"
echo "--------------------------------------------------------------------------"
curl http://localhost:8080/server-example/rest/status
echo ""
echo "-------------------------------------"
curl -I http://localhost:8080/server-example/rest/status


echo ""
echo "Done"
