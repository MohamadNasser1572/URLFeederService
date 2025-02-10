# URL Feeder Service

## Overview
The **URL Feeder Service** is a Spring Boot microservice that allows users to submit URLs via HTTP requests for processing. The service is designed to be lightweight, scalable, and easily deployable using Docker.

## Features
- Submit URLs via REST API
- Store URLs in a database (MySQL/PostgreSQL)
- Process URLs asynchronously
- Expose REST endpoints for retrieving and managing submitted URLs
- Dockerized for easy deployment

---

## Tech Stack
- **Backend:** Java, Spring Boot
- **Database:** MySQL / PostgreSQL
- **Build Tool:** Maven / Gradle
- **Containerization:** Docker
- **API Testing:** Postman / cURL

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/MohamadNasser1572/url-feeder-service.git
cd url-feeder-service
```

### 2️⃣ Configure Database
Edit `application.properties` (for MySQL example):
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/url_feeder
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Build & Run the Service
#### Using Maven:
```sh
mvn clean install
mvn spring-boot:run
```
#### Using Docker:
```sh
docker build -t url-feeder-service .
docker run -p 8080:8080 url-feeder-service
```

---

## 📡 API Endpoints

### **1️⃣ Submit a URL**
```http
POST /api/urls
```
**Request Body:**
```json
{
  "url": "https://example.com"
}
```
**Response:**
```json
{
  "id": 1,
  "url": "https://example.com",
  "status": "PENDING"
}
```

### **2️⃣ Get All Submitted URLs**
```http
GET /api/urls
```

### **3️⃣ Get URL by ID**
```http
GET /api/urls/{id}
```

### **4️⃣ Delete a URL**
```http
DELETE /api/urls/{id}
```

---

## 🛠Contributing
1. Fork the repo & create a new branch (`feature-branch`)
2. Make your changes and test locally
3. Submit a Pull Request 🚀

---

## License
This project is licensed under the MIT License. Feel free to use and modify it!

---

## Contact
- **GitHub:** [MohamadNasser1572](https://github.com/MohamadNasser1572)
- **LinkedIn:** [Mohammad Nasser](https://www.linkedin.com/in/mohammadnasser2005)
