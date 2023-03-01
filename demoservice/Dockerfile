FROM java:21-oracle
RUN mkdir /app
WORKDIR /app
COPY target/demoservice-0.0.1-SNAPSHOT.jar /app
EXPOSE 8110

ENTRYPOINT ["java", "-jar", "demoservice-0.0.1-SNAPSHOT.jar"]
