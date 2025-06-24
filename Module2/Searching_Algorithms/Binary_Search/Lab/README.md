# 🚗 Binary Search Lab – License Plate Registration Lookup

This lab simulates a **licensing department system** where vehicle registration details are stored and searched using **binary search**.

---

## 📘 Scenario

Imagine a government agency needs to look up vehicle registration data quickly using **license plates**.  
To achieve this, we use a **binary search algorithm** on a sorted array of registration entries.

---

## ✅ Problem Statement

Given:
- A sorted array of `Registration` objects (sorted by license plate)
- A `license` string to search for

Implement a method that returns the corresponding registration if found, or a message if not found.

---

## 💡 Core Concepts Used

- **Binary Search**:
  - Start at the middle index
  - Use `String.compareTo()` to compare license plates
  - Halve the search space until a match is found or search space is empty

- **TreeMap**:
  - Automatically sorts the registrations by license
  - Converted to array for binary search

---

## 🧪 Example

```java
String license = "GIG-1870";
