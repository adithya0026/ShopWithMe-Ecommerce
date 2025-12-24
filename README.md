# 🛍️ ShopWithMe - E-Commerce Microservices Application

A full-stack E-commerce application built to demonstrate **Java Backend Architecture**, **RESTful APIs**, and **Frontend Integration**.

This project simulates a real-world shopping experience where users can browse products, view details, manage a shopping cart, and perform user authentication.

## 🚀 Tech Stack

*   **Backend:** Java 21, Spring Boot 3, Spring Data JPA, Hibernate.
*   **Database:** H2 In-Memory Database (SQL).
*   **Frontend:** HTML5, CSS3, Vanilla JavaScript (Fetch API).
*   **Tools:** Maven, VS Code, Git.

## 📂 Project Structure

*   **`backend/`**: Contains the Spring Boot Application (Microservices logic).
*   **`frontend/`**: Contains the User Interface (Responsive Web Design).

## ✨ Key Features

1.  **Product Catalog Service**:
    *   Dynamic fetching of products via REST API.
    *   Product Details page with dynamic data loading.
2.  **Shopping Cart Service**:
    *   Add items to database-backed cart.
    *   Real-time calculation of Subtotal, Tax, and Grand Total.
    *   Remove items dynamically.
3.  **User Authentication Service**:
    *   Secure Registration (prevents duplicate emails).
    *   Login System with validation.

## 🔌 API Endpoints (Backend)

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/products` | Get all products |
| `GET` | `/api/products/{id}` | Get single product details |
| `POST` | `/api/cart` | Add item to cart |
| `GET` | `/api/cart` | View cart items |
| `POST` | `/api/users/register` | Register new user |
| `POST` | `/api/users/login` | User Login |

## 🛠️ How to Run

### 1. Backend Setup
1.  Navigate to the `backend` folder.
2.  Run the Spring Boot Application:
    ```bash
    mvn spring-boot:run
    ```
3.  The Server will start on `http://localhost:8080`.
4.  **Database Console:** Access H2 Console at `http://localhost:8080/h2-console` (User: `sa`, Pass: `password`, JDBC URL: `jdbc:h2:mem:testdb`).

### 2. Frontend Setup
1.  Navigate to the `frontend` folder.
2.  Open `index.html` in any web browser.
3.  Ensure the Backend is running so data loads correctly.

---
**Author:** Adithya P  
**Role:** Java Backend Developer