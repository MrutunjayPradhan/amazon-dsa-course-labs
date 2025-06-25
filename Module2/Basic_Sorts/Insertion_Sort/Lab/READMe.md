# 🛠️ DMV Registration Sort – Insertion Sort Lab (Module 2)

### 📂 Path
`Module2/Basic_Sorts/Selection_sort/Lab/`

---

## 📘 Introduction

You’ve already enhanced the DMV’s automobile registration system using **Binary Search** and **Bubble Sort**. Now, to further improve performance and maintainability, the DMV has asked you to implement **Insertion Sort**.

Unlike Bubble Sort, **Insertion Sort** divides the array into a sorted and unsorted segment and efficiently inserts elements into their correct position in the sorted segment.

---

## 🎯 Goal

- Sort a list of `Registration` objects by their license plate numbers using **Insertion Sort**.
- Replace the Bubble Sort with Insertion Sort in the DMV's backend system.
- Ensure performance optimization by avoiding unnecessary swaps.

---

## 🔍 Task Overview

You are tasked with modifying the `RegistrationSearch` backend system to sort all vehicle registrations using **Insertion Sort**. The method should:

- Traverse the unsorted list from left to right.
- For each element, find the appropriate position in the sorted portion.
- Shift larger elements rightward and insert the current element.
- Maintain readability and efficiency in your implementation.

---

## ✅ Implementation Details

### 🔸 `Database.java`
- Initializes an `ArrayList` of `Registration` objects.
- Implements the `insertionSort()` method.
- Replaces the call to `bubbleSort()` with `insertionSort()` in `main()`.

### 🔸 `Registration.java`
- Holds the `license` and `owner` details.
- Overrides `toString()` to display registrations clearly.

---

## 📌 Sample Output
******* Sorted List ******

ANA-2866 : Zane Hallworth
ATZ-9783 : Sally Oakes
BJT-9772 : Karl Yardley
...
YQD-3410 : Andrea Elsworth

---

## 💡 Reflection & Best Practices

- ✅ **Efficient Element Shifting**: Insertion Sort avoids unnecessary swaps.
- 🔄 **Clean Loop Design**: Use `unsortedIndx`, `sortedIndx`, and clearly named references.
- 💬 **Break When Sorted**: Inner loop exits early when the correct spot is found.
- 🧠 **Enhanced Maintainability**: Easier to trace and debug compared to nested Bubble Sort.

---

## 🧠 Key Learnings

- Implemented Insertion Sort on a real-world class-based system.
- Understood how object comparison (using `compareTo`) works.
- Developed clean and modular Java code separating data and logic.

---

## 👨‍💻 Author

Mrutunjay Pradhan | [GitHub Profile](https://github.com/MrutunjayPradhan)
