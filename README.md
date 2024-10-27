# spring-boot-jpa-hibernate-learning
A Spring Boot project demonstrating the use of JPA and Hibernate for database operations, including examples with JDBC, JPA, and Spring Data JPA.

This project demonstrates the use of Spring Boot with JPA (Java Persistence API) and Hibernate for database operations. It includes examples of using JDBC, JPA, and Spring Data JPA for performing CRUD operations on a Course entity.

## Features

- Spring Boot application setup
- Entity mapping with JPA annotations
- JDBC implementation for database operations
- JPA implementation using EntityManager
- Spring Data JPA implementation with custom query methods
- Command Line Runner for demonstrating database operations

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- JDBC
- H2 Database (assumed, as it's commonly used in Spring Boot tutorials)

## How to Run

1. Clone the repository
2. Open the project in your preferred IDE
3. Run the `LearnJpaAndHibernateApplication` class

## Project Structure

- `LearnJpaAndHibernateApplication.java`: Main Spring Boot application class
- `Course.java`: Entity class representing a course
- `CourseComandLineRunner.java`: CommandLineRunner implementation to demonstrate database operations
- `CourseJdbcRepository.java`: JDBC implementation for course operations
- `CourseJpaRepository.java`: JPA implementation using EntityManager
- `CourseSpringDataJpaRepository.java`: Spring Data JPA repository interface
