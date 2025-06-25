# 🚗 DMV Bubble Sort Lab – Module 2

### 📂 Path
`Module2/Basic_Sorts/Bubble_sort/Database.java`  
`Module2/Basic_Sorts/Bubble_sort/Registration.java`

---

## 🧾 Lab Introduction

In previous labs, we implemented a binary search to look up license plate numbers in a DMV system. However, for optimized performance, we now introduce **Bubble Sort** to pre-sort the data by license numbers.

### 🧠 Why Bubble Sort?
- Simple and easy to maintain.
- Ideal for small datasets like the DMV’s registration list.
- Supports early termination with swap-flag optimization.

---

## 🎯 Lab Goal

The **RegistrationSearch** application used by the **New York DMV** needs registrations sorted by license number. You are to:

- Implement **Bubble Sort** in `Database.java` to sort `ArrayList<Registration>` objects based on the `license` field.
- Add early-exit optimization using a `swapped` flag.
- Display both unsorted and sorted outputs.
- Ensure separation of concerns via `Registration` and `Database` classes.

---

## ⚙️ Implementation Details

### ✔️ `Registration.java`
- Represents a vehicle registration entry.
- Contains license number and owner's name.
- Overrides `toString()` for display.

### ✔️ `Database.java`
- Initializes a list of `Registration` entries.
- Implements `bubbleSort()` to sort by license.
- Uses `compareTo()` to lexicographically compare license strings.
- Includes early exit using a boolean `swapped` flag.
- `printAll()` method displays the list.

---

## 📌 Sample Output
******* Unsorted List ******

SGL-6855 : Tyler Lennon
SDN-2659 : Margaret Finn
ANA-2866 : Zane Hallworth
...
WAO-8258 : Rodney Gilbert

******* Sorted List ******

ANA-2866 : Zane Hallworth
ATZ-9783 : Sally Oakes
BJT-9772 : Karl Yardley
...
YQD-3410 : Andrea Elsworth


---

## 🧠 Key Learning

- Applied a classic sorting algorithm to a real-world object-oriented system.
- Optimized sorting using swap flag for early termination.
- Practiced clean class design separating data (`Registration`) and logic (`Database`).
- Reinforced core Java concepts: ArrayList, classes, casting, and lexicographical comparison.

---

## 🧑‍💻 Author
Mrutunjay Pradhan | 
