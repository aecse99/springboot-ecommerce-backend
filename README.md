📦 E-Commerce Backend API (Spring Boot)

A production-ready Java Spring Boot backend for an e-commerce application. It provides secure and modular REST APIs for product management and user interaction, with built-in authentication using Spring Security.


---

🚀 Features

✅ RESTful APIs with Spring Boot

✅ Spring Security-based authentication (basic auth or in-memory)

✅ API documentation using Swagger

✅ In-memory H2 database

✅ Custom query handling using @Query annotation

✅ Clean architecture with layered structure

✅ Tested with Postman and Swagger UI

✅ AWS-ready architecture (EC2, S3, RDS to be added)



---

🛠️ Tech Stack

Layer Tech Used

Language Java 17 / Java 8
Framework Spring Boot
Security Spring Security (Basic Auth)
Database H2 (in-memory)
API Docs Swagger (SpringFox)
Annotations Lombok
Build Tool Maven
Testing Tools Postman, Swagger UI



---

📂 Project Structure

src
├── config // Security and Swagger configuration
├── controller // REST API endpoints
├── service // Business logic
├── repository // Data access layer
├── model // Entity classes


---

📸 API Documentation

Swagger UI available at:

http://localhost:8080/swagger-ui/

🔐 Swagger secured via Spring Security — credentials are configured in application.properties.


---

⚙️ Getting Started

1. Clone the repository

git clone https://github.com/your-username/ecommerce-backend.git
cd ecommerce-backend

2. Run the application

./mvnw spring-boot:run

3. Open Swagger UI

Navigate to http://localhost:8080/swagger-ui/ to test endpoints


---

🔐 Security Configuration

Spring Security configured via SecurityConfig.java

Certain endpoints (e.g., Swagger, H2 console) are made publicly accessible

User credentials are stored in application.properties for testing



---

🔍 Custom Queries

Used @Query in repository interfaces for:

Searching products

Filtering by category/price

Custom DB operations not supported by default JPA

---

💡 Future Enhancements

[ ] Image upload using @RequestPart with multipart support

[ ] AWS deployment (EC2, S3, RDS)

[ ] Add modules like Cart, Order, and Payment

[ ] Replace in-memory auth with DB or JWT auth



---

👤 Author

Asif Equebal
Backend Developer | Spring Boot | Java | AWS (in progress)
