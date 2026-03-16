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

<img width="1147" height="887" alt="image" src="https://github.com/user-attachments/assets/43b6d279-d471-4940-bfdb-958f3690bf42" />

### 2\. Deposit

Allows depositing money into an existing account.
<img width="680" height="603" alt="image" src="https://github.com/user-attachments/assets/f0abc750-fe5c-46b8-939f-494478bcb18c" />

### 3\. Withdraw

Allows withdrawing money while maintaining a **minimum balance of ₹1000**.
<img width="688" height="607" alt="image" src="https://github.com/user-attachments/assets/4671ef11-90dc-490e-8f4c-9f39a47edce2" />

### 4\. Balance Check

Displays the current balance of the account.
<img width="643" height="540" alt="image" src="https://github.com/user-attachments/assets/3a738503-3085-4c70-a7f4-82ffbd981ccc" />

### 5\. Transaction History

Displays all deposit and withdrawal transactions with timestamps.
<img width="693" height="712" alt="image" src="https://github.com/user-attachments/assets/91967b46-cb18-412c-aec5-21506d5f5d09" />

\---

