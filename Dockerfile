FROM openjdk:17-jdk-alpine

RUN apk update && \
    apk add maven

COPY . /app

WORKDIR /app

RUN mvn clean package

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/*.jar"]