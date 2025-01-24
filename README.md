# Rent A Car Project

This project is a **Spring Boot**-based web application designed to manage a car rental system. The project uses modern Java technologies and follows a multi-layered architectural structure.

---

## 🛠️ Technologies and Dependencies Used

### Backend:
- **Java 17**
- **Spring Boot**
  - Spring Boot Starter Data JPA
  - Spring Boot Starter Validation
  - Spring Boot Starter Web
  - Spring Boot DevTools
  - Spring Boot Starter Test
- **PostgreSQL** (Database)
- **ModelMapper** (DTO conversions)
- **Lombok** (Code simplification)

---

## 🏗️ Architectural Layers

The project is built with a **multi-layered architecture** to ensure scalability, testability, and clear separation of concerns. The layers are:

### 1. WebApi Layer (API Layer)
- Handles incoming HTTP requests and returns responses.
- Responsible for interacting with the business layer.
- Example: `BrandsController`

### 2. Business Layer (Business Logic)
- Contains the core business logic of the application.
- Validates and processes data before passing it to the data layer.
- Interfaces are used to abstract service implementations.
- Example: `BrandService` and its implementation.

### 3. Data Access Layer (Repository)
- Directly interacts with the database using Spring Data JPA.
- Handles CRUD operations and complex queries.
- Example: `BrandRepository`

### 4. Entity Layer
- Contains the domain models (entities) mapped to database tables.
- Example: `Brand`, `Car`, etc.

---
