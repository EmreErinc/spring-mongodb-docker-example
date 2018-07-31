FROM java:8
ADD target/app.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb/mongodb", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]