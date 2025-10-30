# JournalApp-SpringBoot-

## 📝 Journal App

A **Spring Boot-based Journal Application** that allows users to create, view, update, and delete personal journal entries. It includes user authentication, health check APIs, and persistent data storage using Spring Data JPA.

---

### 🚀 Features

* ✍️ Create, edit, and delete journal entries
* 👤 Manage user registration and authentication
* 💾 Store entries securely using Spring Data JPA
* ⚙️ RESTful API architecture with Spring Boot
* 🩺 Health check endpoint for monitoring
* 🧩 Layered structure (Controller → Service → Repository)

---

### 🛠️ Tech Stack

* **Backend:** Spring Boot (Java)
* **Database:** JPA / Hibernate (configurable)
* **Build Tool:** Maven
* **Template Engine:** Thymeleaf (templates folder)
* **Security:** Spring Security (if configured)
* **Testing:** JUnit

---

### 📂 Project Structure

```
journalApp/
├── src/
│   ├── main/
│   │   ├── java/com/shan/journalApp/
│   │   │   ├── controller/         # REST Controllers
│   │   │   ├── service/            # Business Logic
│   │   │   ├── repository/         # JPA Repositories
│   │   │   ├── entity/             # Entity Classes
│   │   │   ├── config/             # App Configurations
│   │   │   └── JournalApplication.java  # Main Application Entry Point
│   │   ├── resources/
│   │   │   ├── application.properties   # App Configurations
│   │   │   ├── templates/               # Thymeleaf Templates
│   │   │   └── static/                  # Static Assets (CSS, JS)
│   └── test/java/com/shan/journalApp/   # Unit Tests
├── pom.xml                              # Maven Dependencies
└── README.md
```

---

### ⚙️ Setup & Run

#### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/journalApp.git
cd journalApp
```

#### 2️⃣ Build the project

```bash
mvn clean install
```

#### 3️⃣ Run the application

```bash
mvn spring-boot:run
```

The app will start on **`http://localhost:8080`** 🚀

---

### 🧠 API Overview

| Method   | Endpoint         | Description              |
| -------- | ---------------- | ------------------------ |
| `GET`    | `/health`        | Health check endpoint    |
| `GET`    | `/journal`       | Get all journal entries  |
| `POST`   | `/journal`       | Create new journal entry |
| `PUT`    | `/journal/{id}`  | Update existing entry    |
| `DELETE` | `/journal/{id}`  | Delete a journal entry   |
| `POST`   | `/user/register` | Register new user        |
| `POST`   | `/user/login`    | User login               |

---

### 🧩 Future Enhancements

* 🔐 Add JWT-based authentication
* ☁️ Deploy to AWS / Render
* 📱 Add frontend with React or Angular
* 📊 Include analytics dashboard for users

---

### 👨‍💻 Author

**Shantanu Raj**


---


