# 🚗 Lab 1 – Linear Search: Car Inventory System

Welcome to BuyNow Automotive Dealership’s digital search system!  
In this lab, we apply **linear search** to a real-world car inventory system that helps users:

- Find cars by **availability status**
- Filter by **make, model, and color**
- Search based on **price range**

---

## ✅ Problem Context

You're building an inventory search tool for a car dealership using a linear search approach.

---

## 🔍 Features Implemented

### 1. `searchAvailability(String availability)`
Finds and returns all cars that match the given availability:
- "IN STOCK", "DEALER TRADE", or "FACTORY ORDER"

### 2. `search(String make, String model, String color)`
Finds cars that match **all three** attributes.

### 3. `searchPrice(double priceLimit, boolean lowerThan)`
Finds cars under or over a given price using the `lowerThan` flag.

---

## 📦 Classes Overview

### `Car.java`
- Represents a car with attributes like `make`, `model`, `color`, `price`, and `availability`.
- Overrides `toString()` for clean display.

### `CarSearch.java`
- Holds the car inventory (`ArrayList`)
- Implements all the linear search methods
- Includes a testable `main()` method with 3 sample searches:
  - IN STOCK filter
  - Red Ford Mustangs
  - Cars under $25,000

---

## 🧪 Sample Output Snippet

