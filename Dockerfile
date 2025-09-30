FROM maven:3.9.9-eclipse-temurin-17
WORKDIR /app
COPY pom.xml /app
COPY src /app/src
RUN mvn -DskipTests clean package
CMD ["java","-jar","target/App.jar"]


