# RewardsTrackerApp

## Overview

The `RewardsTrackerApp` is a Spring Boot application designed to manage reward history and balances for customers. It includes functionalities to add and retrieve reward history records and handle reward balances.

## Features

- **Reward History Management:**
    - Add new reward history records.
    - Retrieve reward history by customer ID.

- **Reward Balance Management:**
    - Retrieve the current reward balance and total cashback for a customer.

## Technologies Used

- **Spring Boot:** For building the backend application.
- **Thymeleaf:** For rendering server-side HTML views.
- **Jackson:** For JSON parsing and serialization.
- **Validation API:** For input validation.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+ (or use the wrapper)
- An IDE like IntelliJ IDEA or Eclipse (optional)

### Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/Ryjen1/RewardsTrackerApp.git
   cd RewardsTrackerApp
   mvn clean install
   mvn spring-boot:run
   ```
The application will start on http://localhost:8080.

## Endpoints

## Reward History

~**Get Reward History by Customer ID**

~**URL:** /api/rewards/history/{customerId}

~**Method:** GET

~**Response:** HTML page showing the reward history.

~**Add Reward History**

~**URL:** http://localhost:8080/api/rewards/post_history
~**Method:** POST

~**Request Body (JSON):**
```sh
{
"transactionId": 123456,
"customerId": 78910,
"transactionDate": "2024-09-06",
"amountEarned": 150.75,
"description": "Referral Bonus"
}
````
~**Response:** JSON object representing the added reward history.

## Reward Balance

~ **Get Reward Balance by Customer ID**

~**URL:** http://localhost:8080/api/rewards/balance/{customerId}

~**Method:** GET

~**Response:** HTML page showing the total cashback and current balance.

~ **Create or Update Reward**.

~**URL:** http://localhost:8080/api/rewards/balance

~ **Method:** POST

~ **Request Body (JSON):**
```sh
{
"customerId": 78910,
"totalCashback": 500.00,
"currentBalance": 200.00
}
```
Response: JSON object representing the created or updated reward.
## Configuration
Date Format: Ensure that date strings in JSON requests and responses follow the format `yyyy-MM-dd`.

## Contact
~ **Author:** Maryjane Ukamaka Okafor
~**LinkedIn:** www.linkedin.com/in/iyukay
