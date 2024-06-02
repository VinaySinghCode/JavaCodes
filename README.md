# Java Spring Boot Project

## Project Overview
This project is a Spring Boot application designed to demonstrate basic concepts of Java and Spring Boot development.

## Features
- RESTful API endpoints
- Basic CRUD operations
- Integration with a relational database (H2/MySQL)
- Basic exception handling
- Unit and integration testing

## Getting Started

### Prerequisites
- JDK 11 or higher
- Maven 3.6.0 or higher
- Git
- An IDE (IntelliJ IDEA, Eclipse, etc.)

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/YourUsername/YourRepositoryName.git
    cd YourRepositoryName
    ```

2. **Build the project:**
    ```bash
    mvn clean install
    ```

3. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

### Configuration
The application configuration can be found in the `application.properties` file located in the `src/main/resources` directory.

```properties
# Server configuration
server.port=8080

# Database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
