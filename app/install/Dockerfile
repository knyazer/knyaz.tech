FROM knyazer/knyaz-tech-spring-boot:latest

COPY *.pfx /workspace/src/main/resources/certs/
COPY ssl_application.properties /workspace/src/main/resources/application.properties

RUN mvn -B package --file pom.xml -DskipTests
RUN cp /workspace/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]