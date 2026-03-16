# Spring Boot Banking System

A **Bank Management System** built using **Spring Boot, Java, MySQL, HTML, CSS, and JavaScript**.

This project demonstrates how banking operations such as **account creation, deposits, withdrawals, balance checking, and transaction history** can be implemented using a **Spring Boot backend with a web-based dashboard**.

\---

## Features

* Create Bank Account
* Automatic 11-digit Account Number Generation
* Aadhaar Validation (12 digits)
* Phone Number Validation (10 digits)
* Duplicate Aadhaar Prevention
* Deposit Money
* Withdraw Money
* Minimum Balance Rule (₹1000)
* Insufficient Balance Handling
* Transaction History Tracking
* Real-time result display on dashboard

\---

## Technologies Used

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **MySQL**
* **HTML**
* **CSS**
* **JavaScript**
* **Maven**

\---

## Project Structure

&#x20;   bank-system
    │
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com.bank.bank\_system
    │   │   │       ├── controller
    │   │   │       │   └── BankController.java
    │   │   │       ├── service
    │   │   │       │   └── BankService.java
    │   │   │       ├── repository
    │   │   │       │   └── AccountRepository.java
    │   │   │       │   └── TransactionRepository.java
    │   │   │       ├── model
    │   │   │       │   └── Account.java
    │   │   │       │   └── Transaction.java
    │   │   │       └── BankSystemApplication.java
    │   │
    │   │   ├── resources
    │   │   │   ├── templates
    │   │   │   │   └── index.html
    │   │   │   └── application.properties
    │
    ├── pom.xml
    └── README.md


\---

## System Architecture

&#x20;   Browser (HTML + CSS + JS)
            │
            ▼
    Spring Boot Controller
            │
            ▼
    Service Layer (Business Logic)
            │
            ▼
    Repository Layer (Spring Data JPA)
            │
            ▼
    MySQL Database


\---

## Database Setup

Create the database and tables in MySQL.

``` sql
CREATE DATABASE bankdb1;
USE bankdb1;
```


\---

## How to Run the Project

### 1\. Navigate to the Project Folder

&#x20;   cd bank-system


### 2\. Run the Application

&#x20;   mvn spring-boot:run


or run the main class:

&#x20;   BankSystemApplication.java


### 3\. Open Browser

&#x20;   http://localhost:8080


\---

## Functional Modules

### 1\. Account Creation

Creates a new bank account with automatic **11-digit account number generation**.

### 2\. Deposit

Allows depositing money into an existing account.

### 3\. Withdraw

Allows withdrawing money while maintaining a **minimum balance of ₹1000**.

### 4\. Balance Check

Displays the current balance of the account.

### 5\. Transaction History

Displays all deposit and withdrawal transactions with timestamps.

\---

