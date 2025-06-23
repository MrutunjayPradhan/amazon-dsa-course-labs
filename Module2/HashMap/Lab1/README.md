# Lab 1 - HashMap: Waiting List Manager

## 📌 Objective
Implement a registration waiting list manager using Java `HashMap` to efficiently store, search, update, and remove student records by **last name**.

---

## 🧪 Lab Summary

In this lab, we build a **Registration Waiting List Application** for a university system using Java's `HashMap`. This system will allow us to **add**, **update**, **view**, and **remove** student entries dynamically.

---

## 🧠 Concept Focus

- Core CRUD operations using `HashMap`
- Efficient data management with constant time complexity
- Object-Oriented Programming (OOP) with custom `Student` class

---

## 💡 Real-World Analogy

A university needs to keep track of students waiting for admission to specific programs. Instead of storing them in a list (which requires scanning the whole list to find or update someone), a **HashMap** allows instant access to students using their **last name**.

---

## 📦 Components

### 🔹 `Student` Class
- Fields: `studentId`, `firstName`, `lastName`, `status`
- Represents a student in the waiting list
- Includes a constructor and overridden `toString()` method

### 🔹 `ListManager` Class
- Uses `HashMap<String, Student>` to manage students by `lastName`
- Key Methods:
  - `listStudents()` – Lists all students
  - `findStudent(String lastName)` – Finds and prints student
  - `updateStudentStatus(String lastName, String newStatus)` – Updates student status
  - `removeStudent(String lastName)` – Removes student

### 🔹 `WaitingList` Class
- Entry point (`main` method)
- Initializes a list of students
- Calls operations using a switch-case based on the selected option

---

## 🚀 How to Run

1. Open `WaitingList.java`
2. Change the `option` variable to select functionality:

```java
int option = 1; // Options: 1 - List, 2 - Find, 3 - Update, 4 - Remove
