Download maven and set environment variable , and test it`s running well by running command below in cmd: 
mvn --version
 
Got to the project root as:
 
Open cmd and navigate to the project root like above.
Run below commands in order:
1.	mvn clean install -DskipTests
2.	mvn spring-boot:run
3. once the application run you can browser it with the next uri: http://localhost:8080/api/v1/customer
