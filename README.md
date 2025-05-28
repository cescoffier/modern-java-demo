# Modern Java Demo

This repository showcases a series of progressive examples demonstrating modern Java development practices with Quarkus.  
It focuses on comparisons with legacy frameworks and illustrates how to build AI-infused applications.

## Overview

The project is organized into three main modules:

1. **1-hello-quarkus**  
   Introduces a basic Quarkus application to get started with the framework.  
   It covers REST endpoints, Panache, Kafka, and more, serving as a foundation for understanding Quarkus and its capabilities.

2. **2-todo-apps**  
   Presents a simple Todo application, illustrating RESTful APIs and persistence.  
   It shows how to build a full-stack application using Quarkus, including database access with Panache and Hibernate ORM, and integration with a PostgreSQL database.  
   It also compares Quarkus with legacy frameworks like Spring Boot and Jakarta EE, highlighting its advantages for modern Java development.

3. **3-ai-infused-applications**  
   Demonstrates how to integrate AI capabilities into Java applications, leveraging modern libraries and APIs to build intelligent and cognitive systems.

Each module is self-contained and can be run independently.

## Prerequisites

- Java 21 or higher
- Apache Maven 3.9 or higher
- Docker or Podman (for modules requiring containerized services via Quarkus Dev Services)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/cescoffier/modern-java-demo.git
cd modern-java-demo
```

### Build and Run a Module

Navigate to the desired module directory and run:

```bash
mvn quarkus:dev
```

This starts the application in development mode with hot-reloading and other developer-friendly features.

## License

This project is licensed under the Apache License 2.0.

