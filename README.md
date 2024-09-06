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

