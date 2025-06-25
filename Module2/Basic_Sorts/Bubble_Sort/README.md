# 🏀 Bubble Sort Activity – Module 2

### 📂 Path
`Module2/Basic_Sorts/Bubble_sort/Activity.java`

---

## 📘 Challenge Description

In this activity, we apply the **Bubble Sort algorithm** to sort a list of basketball player heights in **descending order**.

### 🔢 Input
Heights of basketball players (in cm):  
`[198, 185, 210, 176, 195]`

---

## 🎯 Objective

Sort the given list of heights in **descending order** using the **Bubble Sort** algorithm.

---

## ✅ Requirements
- Implement bubble sort to sort the array `heights[]` in **descending order**.
- Print the sorted heights in the format:  
  `Sorted heights in descending order: 210 198 195 185 176`
- Use clean coding practices and handle edge cases like:
  - Empty array
  - Single-element array

---

## 💡 Reflection Points

- 🔁 **Optimized Passes**: A boolean flag `notSwaped` helps in early termination if the array becomes sorted before all passes.
- 🚫 **Avoid Redundant Swaps**: Only swap when necessary (strict comparison).
- 🧪 **Edge Case Handling**: Gracefully returns for empty or single-element arrays.
- 🧼 **Clean Looping**: Separate `outer` and `inner` loops improve code readability and maintainability.

---

## 📌 Sample Output

Sorted heights in descending order: 210 198 195 185 176
---

## 🧠 Learnings

- Bubble Sort is simple but can be optimized for better performance on nearly sorted data.
- Early exit using flags saves unnecessary comparisons.
- Clean and readable code improves debugging and maintainability.

---

## 👨‍💻 Author
Mrutunjay Pradhan | 