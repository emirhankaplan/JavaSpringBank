# 🏦 JavaSpringBank

A banking web application built with **Spring Boot 3**, **Thymeleaf** and **MySQL**. It offers role-based dashboards for admins, bankers and customers, balance operations and a loan-application workflow.

## ✨ Features

- **Authentication** — register and log in with BCrypt-hashed passwords; users are redirected to the dashboard for their role (`admin`, `banker`, `customer`)
- **Customer dashboard** — view the current balance, deposit and withdraw money
- **Loan applications** — customers apply for a loan; bankers review pending applications and approve or reject them
- **User management** — list, edit and delete customers and bankers, create banker accounts
- **Persistence** — Spring Data JPA (Hibernate) on MySQL with automatic schema updates

## 🧰 Tech stack

Java 21 · Spring Boot 3.3 · Spring MVC · Spring Data JPA · Thymeleaf · Spring Security (BCrypt) · MySQL · Lombok · Maven

## 📁 Project structure

```text
Bank_WEB_APP/
├── src/main/java/com/example/Eray/
│   ├── controller/   # Auth, Admin, Bankers, Customer and LoanApplication controllers
│   ├── model/        # User and LoanApplication entities
│   ├── repository/   # Spring Data JPA repositories
│   ├── service/      # UserService, LoanApplicationService
│   ├── database/     # DataSource configuration
│   └── SecurityConfig.java   # BCrypt password encoder
└── src/main/resources/
    ├── application.properties
    └── templates/    # admin, auth, bankers, customer, loanapplications (Thymeleaf views)
```

## 🚀 Getting started

**Prerequisites:** JDK 21 and a running MySQL server.

1. Create the database:

   ```sql
   CREATE DATABASE banka2;
   ```

2. Set your MySQL username and password in `src/main/resources/application.properties` and `database/DbConnection.java`
   (ideally read them from environment variables instead of hard-coding them).

3. Run the application:

   ```bash
   cd Bank_WEB_APP
   ./mvnw spring-boot:run
   ```

4. Open <http://localhost:8080/auth/register> to create a user, then log in at <http://localhost:8080/auth/login>.

## ⚠️ Note

This is a learning project. Spring Security's auto-configuration is disabled and pages are not access-controlled (the username is part of the URL), so it is not intended for production use.
