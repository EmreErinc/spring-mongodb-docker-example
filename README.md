# spring-mongodb-docker-example

This project created for development of simple web API with `java` `Spring Boot`.
In additon to this project contains `Docker` for containerization.

To run project;

Firstly pull `mongo` from hub.docker.com

```
docker pull mongo
```
If you don't have any mongo container, you should create one

```
docker run --name <custom_mongo_container_name> --restart=always -d -p 27000:27017 mongo
```

After you ready to run project.

```
mvn clean install
```

After mvn operation, project docker image should create. 

If image **doesn't create**
```
docker build -f Dockerfile -t springboot/springboot-mongodb-docker .
```

If image **successfully create**

```
docker run -p 7000:7000 --link=<custom_mongo_container_name> springboot/springboot-mongodb-docker
```
