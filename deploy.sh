#!/bin/bash
mvn clean package
sudo cp target/phonebook.war /opt/tomcat/webapps/