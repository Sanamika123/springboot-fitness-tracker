# springboot-fitness-tracker
A RESTful Fitness Tracker API built using Spring Boot, Java 17, MySQL, and Spring Data JPA. Includes CRUD APIs for user registration, workouts, and diet logs with pagination, validation, and global exception handling.

# 🏋️‍♀️ FitTracker - Spring Boot Fitness Tracking App

FitTracker is a **Spring Boot based fitness tracking application** that allows users to manage their daily diet and workouts.  
This project demonstrates strong backend development skills, REST API design, and clean code structure.

## 🚀 Tech Stack
- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- REST APIs
- Maven
- Postman (for testing)

## 🧭 Features
- 👤 User-wise Diet Tracking
- 🍽️ Add and List Diet Plans
- 📅 Pagination Support for Diet Listing
- 🧾 RESTful API Endpoints
- 🗄️ MySQL Database Integration

## 🧪 Sample Endpoints
| Method | Endpoint                          | Description                |
|--------|------------------------------------|----------------------------|
| POST   | `/api/users/{userId}/diet`         | Add a new diet plan        |
| GET    | `/api/users/{userId}/diet`         | Get paginated diet plans   |

## 🛠️ How to Run Locally
1. Clone the repository
   ```bash
   git clone https://github.com/Sanamika123/springboot-fitness-tracker.git

