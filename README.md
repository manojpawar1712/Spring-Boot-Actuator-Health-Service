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

## By using below endpoint we can get list of end names which can be used to fetch data

http://localhost:8080/actuator/metrics

### Output will be like

<pre>
{
  "names": [
    "application.ready.time",
    "application.started.time",
    "disk.free",
    "disk.total",
    "executor.active",
    "executor.completed",
    "executor.pool.core",
    "executor.pool.max",
    "executor.pool.size",
    "executor.queue.remaining",
    "executor.queued",
    "http.server.requests",
    "http.server.requests.active",
    "jvm.buffer.count",
    "jvm.buffer.memory.used",
    "jvm.buffer.total.capacity",
    "jvm.classes.loaded",
    "jvm.classes.unloaded",
    "jvm.compilation.time",
    "jvm.gc.concurrent.phase.time",
    "jvm.gc.live.data.size",
    "jvm.gc.max.data.size",
    "jvm.gc.memory.allocated",
    "jvm.gc.memory.promoted",
    "jvm.gc.overhead",
    "jvm.gc.pause",
    "jvm.info",
    "jvm.memory.committed",
    "jvm.memory.max",
    "jvm.memory.usage.after.gc",
    "jvm.memory.used",
    "jvm.threads.daemon",
    "jvm.threads.live",
    "jvm.threads.peak",
    "jvm.threads.started",
    "jvm.threads.states",
    "logback.events",
    "process.cpu.time",
    "process.cpu.usage",
    "process.start.time",
    "process.uptime",
    "system.cpu.count",
    "system.cpu.usage",
    "tomcat.sessions.active.current",
    "tomcat.sessions.active.max",
    "tomcat.sessions.alive.max",
    "tomcat.sessions.created",
    "tomcat.sessions.expired",
    "tomcat.sessions.rejected"
  ]
}
</pre>

We can use name to fetch data lie  ->  http://localhost:8080/actuator/metrics/application.ready.time
