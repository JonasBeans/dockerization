# Dockerization
## Description
This is a DevOps hobby project. Learning to use: 
- Docker
- Git 
- Maven builds
- Linux on RaspberryPi
- DevOps 
- CI/CD

## Explanation
Using a Raspberrypi as a server at home.     
First make little Spring Boot application.  
Then push project on Github.  
Clone the project on the server.   
Make a .jar file on the server.  
Build a docker image using the .jar file.   
Run the docker image.   

## Struggles 
RaspberryPi uses ARM/v7 architecture. OpenJDK doesn't support such a version. 
In other to make a docker image you will have to use eclipse-temurin:11
