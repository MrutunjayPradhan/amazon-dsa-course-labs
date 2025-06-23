# 🧠 HashMap Activities (Java Collections)

This folder contains hands-on coding activities based on different implementations of the **Map** interface in Java.

Each activity is implemented using a **single class**, focusing on core operations like insertion, deletion, lookup, and traversal with respect to the specific behavior of each map type.

---

## ✅ Completed Activities

### 1. `LinkedHashMap` — Book Borrowing System
- Maintains **insertion order** of student-book entries.
- Implements operations like:
  - Borrowing a book
  - Checking if a student borrowed a book
  - Returning a book
  - Borrowing only if not already borrowed
- Demonstrates usage of:
  - `put()`
  - `remove()`
  - `containsKey()`
  - `containsValue()`
  - `entrySet()` for ordered iteration

### 2. `LinkedHashMap` (Access Order) — LRU Cache Using Students
- Demonstrates use of **accessOrder=true** to implement a Least Recently Used (LRU) Cache.
- Automatically removes the eldest (least recently accessed) entry when the size exceeds a fixed capacity.
- Key Concepts:
  - `LinkedHashMap` with access-based reordering
  - Overriding `removeEldestEntry()` for eviction
  - `Student` class with overridden `toString()` for display


