# 🏨 BookMyStayApp – Hotel Booking Management System

## 📌 Project Overview

BookMyStayApp is a console-based Hotel Booking Management System developed using **Core Java and Data Structures**.
This project demonstrates real-world system design concepts such as booking management, inventory handling, concurrency, and data persistence.

---

## 🎯 Objectives

* Apply Core Java concepts in real-world scenarios
* Use Data Structures for efficient system design
* Prevent double booking and ensure consistency
* Build scalable and maintainable architecture

---

## 🧠 Key Concepts Used

* Object-Oriented Programming (OOP)
* Abstraction, Inheritance, Polymorphism
* Data Structures:

  * ArrayList
  * HashMap
  * HashSet
  * Queue (FIFO)
  * Stack (LIFO)
* Exception Handling
* Multithreading & Synchronization
* File Handling & Serialization

---

## ⚙️ Features (Use Cases)

### ✅ UC1 – Application Entry

* Basic program execution using `main()` method

### ✅ UC2 – Room Types (OOP)

* Abstract classes and inheritance for room types

### ✅ UC3 – Inventory Management

* Centralized room availability using HashMap

### ✅ UC4 – Room Search

* Read-only access with filtering logic

### ✅ UC5 – Booking Request Queue

* FIFO queue for fair booking handling

### ✅ UC6 – Reservation & Allocation

* Room allocation with double-booking prevention

### ✅ UC7 – Add-On Services

* Additional services like food, spa, WiFi

### ✅ UC8 – Booking History & Reporting

* Store bookings and generate reports

### ✅ UC9 – Error Handling & Validation

* Custom exceptions and input validation

### ✅ UC10 – Cancellation & Rollback

* Cancel bookings and restore inventory using Stack

### ✅ UC11 – Concurrent Booking

* Multithreading with synchronization to avoid race conditions

### ✅ UC12 – Data Persistence

* Save and restore data using serialization

---

## 🏗️ Project Structure

```
src/
 ├── main/java/com/bookmystay/
 │    ├── model
 │    ├── service
 │    ├── repository
 │    ├── util
 │    └── main
```

---

## ▶️ How to Run

1. Open project in IntelliJ IDEA
2. Navigate to:

   ```
   com.bookmystay.main.Main
   ```
3. Run the `main()` method

---

## 🔄 Git Workflow

* `main` → stable version
* `develop` → integration branch
* `feature/ucX` → individual use case implementation

---

## 📊 Sample Output

```
Booking Confirmed for User1 → Single-1
Booking Confirmed for User2 → Single-2
No rooms available for User3
```

---

## 🧪 Testing

* Unit testing using JUnit
* Separate test cases for each use case (UC1–UC12)

---

## 🚀 Future Enhancements

* GUI using JavaFX / Web interface
* Database integration (MySQL / Firebase)
* Payment gateway integration
* REST API support

---

## 👨‍💻 Author

**Saksham Thapar**
B.Tech CSE Student
SRM University

---

## 📌 Conclusion

This project demonstrates how fundamental programming concepts and data structures can be used to build a real-world scalable system.

---

⭐ If you found this project helpful, consider giving it a star!
