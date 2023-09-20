#
# Build stage
#
FROM maven:3.8.6-openjdk-11 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:11
COPY --from=build /target/hello-world-0.0.1.jar hello-world.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","hello-world.jar"]