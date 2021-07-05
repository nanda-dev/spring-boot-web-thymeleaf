# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Baeldung: Spring Boot CRUD Application with Thymeleaf - This project follows the code from this little tutorial](https://www.baeldung.com/spring-boot-crud-thymeleaf)
* [Mkyong: Docker + Spring Boot examples - Dockerization follows the example provided here](https://mkyong.com/docker/docker-spring-boot-examples/)

## Run Locally
### With Docker
Follow the steps below to run the code locally using the standalone fat jar Docker (you would need jdk11+, maven, docker, and a web browser):
```sh
$ git clone https://github.com/nanda-dev/spring-boot-web-thymeleaf
$ cd spring-boot-web-thymeleaf

# Build and Run fat jar

$ mvn clean package
$ java -jar target/spring-boot-web-thymeleaf-app-0.0.1-SNAPSHOT.jar

# access http://localhost:8080

# dockerize

# create a docker image
$ sudo docker build -t spring-boot-web-thymeleaf-app:1.0 .
# run it
# -p [hostPort]:[containerPort]
$ sudo docker run -d -p 9090:8080 -t spring-boot-web-thymeleaf-app:1.0

# access http://localhost:9090
```
