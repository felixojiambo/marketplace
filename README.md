# E-commerce Microservices Architecture

This project demonstrates a microservices architecture for an e-commerce platform using Spring Boot, Spring Cloud, and Resilience4J for fault tolerance.

## Overview

The system consists of several microservices:

- **API Gateway**: Acts as the single entry point for client applications.
- **Product Service**: Manages product data.
- **Order Service**: Handles order processing.
- **Inventory Service**: Checks product availability.
- **Discovery Server**: Service registry for service discovery.
- **Notification Service**: Sends notifications upon specific events.

## Configuration

Each microservice has its own `application.yml` or `application.properties` file for configuration. Key configurations include:

- **Spring Cloud Gateway** routes for routing requests to the appropriate services.
- **Eureka** for service discovery.
- **OAuth2** for securing API endpoints.
- **Zipkin** for distributed tracing.
- **Prometheus** for monitoring.

## Building and Running

### Prerequisites

- Java 11+
- Maven or Gradle
- Docker (optional)

### Steps

1. Clone the repository.
2. Navigate to each service directory and build it using `mvn clean install` or `gradle build`.
3. Start the Discovery Server (`./start-discovery-server.sh`).
4. Register services with the Discovery Server.
5. Start the API Gateway (`./start-api-gateway.sh`).

## Services Details

### API Gateway

Acts as the entry point for all client requests. It routes requests to the appropriate microservice based on the path.

### Product Service

Manages product data. Allows creating new products and retrieving all products.

### Order Service

Handles order placement. It checks product availability through the Inventory Service before placing an order.

### Inventory Service

Checks if products are in stock. It communicates with the Product Service to fetch product details.

### Discovery Server

A service registry that allows services to discover each other dynamically.

### Notification Service

Sends notifications when orders are placed. It listens to Kafka topics for such events.

## Monitoring and Observability

- **Zipkin**: Used for distributed tracing across services.
- **Prometheus**: For monitoring metrics.
- **Resilience4J**: Provides fault tolerance features like circuit breakers and rate limiters.

## Contributing

Contributions are welcome Please submit a pull request or open an issue to discuss potential improvements or additions.

## License

This project is licensed under the MIT License.
