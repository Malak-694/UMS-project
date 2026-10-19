# UMS Project — University Management System

A lightweight **University Management System** REST API built with **Spring Boot** and **SQLite**. It exposes endpoints to query student records stored in a local SQLite database.

---

## 🚀 Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java 17 |
| Framework | Spring Boot 3.4.0 |
| Persistence | Spring Data JPA + SQLite (via `sqlite-jdbc 3.45.1.0`) |
| Build Tool | Maven (Maven Wrapper included) |
| Database | SQLite (`mydb.db`) |

---

## 📁 Project Structure

```
UMS-project/
├── src/
│   └── main/
│       ├── java/com/example/demo/
│       │   ├── DemoApplication.java          # Spring Boot entry point
│       │   ├── controller/
│       │   │   └── studentController.java    # REST controller
│       │   ├── Services/
│       │   │   └── studentServices.java      # Business logic & DB queries
│       │   └── models/
│       │       ├── Student.java              # Student entity / POJO
│       │       └── ConnectDB.java            # DB connection helper
│       └── resources/
│           └── application.properties        # App configuration
├── mydb.db                                   # SQLite database file
├── pom.xml                                   # Maven build descriptor
├── mvnw / mvnw.cmd                           # Maven wrapper scripts
└── README.md
```

---

## 📋 Prerequisites

- **Java 17** or higher installed ([Download](https://adoptium.net/))
- **Maven** — or just use the included Maven Wrapper (`mvnw`)

---

## ⚙️ Running the Application

### Using the Maven Wrapper (recommended)

**Windows:**
```cmd
mvnw.cmd spring-boot:run
```

**Linux/macOS:**
```bash
./mvnw spring-boot:run
```

The application will start on **`http://localhost:8080`** by default.

---

## 🌐 API Endpoints

### Get Student by ID

```
GET /student?id={studentId}
```

| Parameter | Type | Default | Description |
|-----------|------|---------|-------------|
| `id` | `String` | `2` | The student's ID (`sid`) in the database |

**Example Request:**
```
GET http://localhost:8080/student?id=1
```

**Example Response:**
```
Hello John!
```

---

## 🗄️ Database

The project uses a local **SQLite** database file (`mydb.db`) located in the project root directory.

### Expected Schema

```sql
CREATE TABLE Student (
    sid  INTEGER PRIMARY KEY,
    name TEXT NOT NULL
);
```

> The `studentServices` class queries the `Student` table using a parameterized SQL query to look up a student by their `sid`.

---

## 🔧 Configuration

Application settings are defined in `src/main/resources/application.properties`.

```properties
spring.application.name=demo
```

The SQLite database URL is set directly in `studentServices.java`:

```java
private static final String DB_URL = "jdbc:sqlite:mydb.db";
```

> ℹ️ The path `mydb.db` is relative to the directory from which the application is launched (the project root).

---

## 🏗️ Building a JAR

To package the application into an executable JAR:

```cmd
mvnw.cmd clean package
```

The JAR will be generated in the `target/` directory. Run it with:

```cmd
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

---

## 📦 Dependencies

| Dependency | Purpose |
|------------|---------|
| `spring-boot-starter-web` | REST API support |
| `spring-boot-starter-data-jpa` | JPA/ORM support |
| `spring-boot-devtools` | Hot reload during development |
| `sqlite-jdbc` | JDBC driver for SQLite |
| `spring-boot-starter-test` | Unit & integration testing |
