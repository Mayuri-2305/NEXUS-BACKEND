# NEXUS – Financial Planning Backend

## Overview

NEXUS is a personalized financial planning platform designed to help Indian salaried individuals manage their income, expenses, budgets, and financial goals.

This repository contains the Spring Boot backend, which provides REST APIs and connects the application to a MySQL database.

## Technology Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API

## Main Features

- User registration API
- Financial plan creation and storage
- Financial plan retrieval
- MySQL database integration
- REST endpoints for the React frontend

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/health` | Check backend availability |
| POST | `/api/users` | Register a user |
| POST | `/api/financial-plans` | Save a financial plan |
| GET | `/api/financial-plans` | Retrieve financial plans |

## Database Configuration

Create a MySQL database named `nexus_db`.

Configure the database URL, username, and password in your local `application.properties` file. This file is excluded from GitHub to protect credentials.

**Never commit database passwords or other secrets.**

## Run the Backend

1. Install a compatible Java JDK and MySQL Server.
2. Configure the local database connection.
3. Open a terminal in the backend project directory.
4. Run the application on Windows:

   `.\mvnw.cmd spring-boot:run`

5. Check the health endpoint:

   `http://localhost:8080/api/health`

## Frontend Integration

The backend is designed to work with the NEXUS React frontend through REST APIs.

## Project Status

Developed as a college project. Additional features and improvements may be added in future versions.
