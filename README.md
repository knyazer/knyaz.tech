# knyaz.tech
Source code for [knyaz.tech](http://knyaz.tech) (should be available on the Internet)

## Consists of 5 docker containers
* [nginx](#nginx)
* [app](#app)
* [git](#git)
* [api](#api)
* [db](#db)
---
### nginx
Docker container with official nginx debian image. Has default page in case there are problems and configuration. Server acts as a reverse proxy, passing requests to the specific ports of other Docker containers.

### app
Main application, made with Spring Boot + Java 17. MVC pattern. Accessible at knyaz.tech.

### git
[Gitbucket](https://github.com/gitbucket/gitbucket) server, with handmade docker image because official image does not work with ARM. Accessible at [git.knyaz.tech](http://direct.knyaz.tech).

### api
API service available using GET requests. Spring Boot + Java 17. No pattern (I do not know about any patterns for API (-_-) ). Accessible at [api.knyaz.tech](http://api.knyaz.tech).

### db
Shared PostgreSQL database witthout global access (probably). Only API service has access to the database, so even though I plan to make more services with access to the database, it could be considered as "Database per microservice" pattern.
