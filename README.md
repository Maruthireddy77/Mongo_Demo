
# Spring Boot with MongoDB and Docker

This is a simple **Spring Boot** application integrated with **MongoDB**. It demonstrates how to build and run a Spring Boot app using Docker with MongoDB as the database.

## Project Structure

```
src/
  └── main/
      └── java/com/spring/user/
          ├── controller/                        # REST controllers
          ├── model/                             # MongoDB models
          ├── repository/                        # MongoDB repositories
          └── UserMongoDbApplication.java        # Main Spring Boot app
Dockerfile                                    # Dockerfile to containerize the app
pom.xml                                       # Maven configuration
```
