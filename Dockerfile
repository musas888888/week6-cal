FROM maven:latest
LABEL auther="Musa"
WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java","-jar","target/myapp.jar"]


