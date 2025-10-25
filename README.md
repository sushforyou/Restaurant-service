# 🍽️ Restaurant Service

**Restaurant Service** is a microservice built with **Spring Boot**, responsible for managing restaurant-related data such as restaurant details, menus, and availability.  
It is a part of a microservices-based system that communicates with other services (e.g., Order Service, Customer Service) via **Eureka Discovery Server**.

---

## 🚀 Features

- Register and manage restaurant details  
- CRUD operations on restaurant data  
- Integration with **Eureka Server** for service discovery  
- Uses **MySQL** as the backend database  
- Supports multiple environments (dev, test) via YAML configuration  
- Built with **Spring Boot JPA & Hibernate**

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|-------------|
| Backend | Spring Boot 3+, Java 17 |
| Database | MySQL 8 |
| ORM | Hibernate / Spring Data JPA |
| Service Discovery | Eureka |
| Build Tool | Maven |
| API Docs | Swagger (optional) |

---

## ⚙️ Configuration

### Application Profiles

| Profile | Purpose |
|----------|----------|
| `dev` | Development environment using `restaurantdb_dev` |
| `test` | Testing environment using `restaurantdb_test` |

### YAML Setup

#### `application.yml`
```yaml
spring:
  application:
    name: RESTAURANT-SERVICE
  profiles:
    active: dev
server:
  port: 9091
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka/
