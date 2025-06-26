# 🚗 DMV Registration System – Merge Sort Lab

## 📍 Overview

This lab enhances the DMV's automobile registration system by implementing the **Merge Sort algorithm**. It builds upon previous sorting solutions (Bubble Sort and Insertion Sort) and introduces a more scalable sorting approach for large datasets.

---

## 🧠 Problem Statement

The New York DMV system needs to sort vehicle registrations by **license plate numbers**. Earlier versions used Bubble and Insertion Sorts, but Merge Sort offers better efficiency for large data.

---



## 🎯 Objectives

- Split the main `registrations` list into subarrays.
- Recursively sort and merge them using Merge Sort logic.
- Replace Bubble and Insertion sort calls with `mergeSort()` in the main method.
- Maintain clean and readable output using `toString()` of the `Registration` class.

---

## 🔧 Technologies Used

- **Java**
- Collections: `ArrayList`
- Sorting Algorithm: **Merge Sort (Bottom-Up Iterative)**

---

## 📂 Files



MergeSortLab/
│
├── Database.java      // Implements mergeSort(), merge(), and manages Registration data
├── Registration.java  // POJO representing license and owner
└── README.md          // You're reading it!


---

## ✅ Sample Output

```

\*\*\*\*\*\*\* Sorted ArrayList \*\*\*\*\*\*

ANA-2866	: Zane Hallworth
ATZ-9783	: Sally Oakes
...
YQD-3410	: Andrea Elsworth

```

---

## ✨ Features

- Efficient sorting of objects (`Registration`) by a specific field (`license`)
- Clear object formatting via `toString()`
- Bottom-up iterative merge sort for stable and scalable performance

---

## 👨‍💻 Author

[Mrutunjay Pradhan](https://github.com/MrutunjayPradhan)
```

---




