FROM maven:3-openjdk-17-slim as build

WORKDIR /src

#COPY pom.xml pom.xml
#COPY api/pom.xml api/pom.xml
#COPY shared/pom.xml shared/pom.xml
#RUN mvn dependency:go-offline -B

COPY . .
RUN mvn package -DskipTests


FROM openjdk:17 as execute
COPY --from=build /src/api/target/*.jar /app/service-api.jar

ENTRYPOINT ["java", "-jar", "/app/service-api.jar"]
