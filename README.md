# Spring Boot Actuator Demo

This is a simple Spring Boot project demonstrating the use of Spring Boot Actuator for monitoring and managing your Spring Boot application.

## Features
- Exposes various endpoints for monitoring the application's health and metrics.
- Customizes the default Actuator endpoints.
- Demonstrates the use of health checks, metrics, and logging via Actuator.
- Example of how to secure Actuator endpoints.


## Prerequisites

- Java 21 or higher.
- Maven or Gradle (Maven is used in this example).

## Getting Started

### 1. Clone the Repository

Clone this repository to your local machine:
git clone https://github.com/manojpawar1712/Spring-Boot-Actuator-Health-Service.git
cd spring-boot-actuator-demo


2. Build the Project
You can build the project using Maven or Gradle.

### Using Maven:
mvn clean install

# Access Actuator Endpoints
Once the application is running, you can access the Actuator endpoints by navigating to:
- /actuator/health - Displays the health status of the application.
- /actuator/metrics - Provides various application metrics.
- /actuator/beans - Displays all Spring beans in the application context.
- /actuator/info - Displays custom information about your application.

  ### e.g., http://localhost:8080/actuator/


## To secure Actuator endpoints, you can add Spring Security and configure access restrictions.

In application.properties, configure the security for Actuator endpoints:

- management.endpoints.web.exposure.include=health,info,metrics
- management.endpoint.health.show-details=always
- spring.security.user.name=admin
- spring.security.user.password=adminpassword



