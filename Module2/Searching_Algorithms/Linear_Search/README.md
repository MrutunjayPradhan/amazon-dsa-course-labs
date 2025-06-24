# 🔍 Linear Search Activity – Multiple Occurrences

This activity demonstrates a practical use of the **Linear Search** algorithm to find all occurrences of a specific target in an array, including duplicates.

---

## ✅ Problem Statement

Given:
- An integer array (e.g., `[10, 20, 30, 20, 50]`)
- A target value (e.g., `20`)

The task is to return all indices where the target value occurs using linear search.

---

## 🚀 Implementation Details

- Uses an `ArrayList<Integer>` to collect matching indices
- Converts the list to a primitive `int[]` before returning
- Returns an empty array when:
  - The input array is empty
  - The target value is not found

---

## 📘 Sample Output

For input:
```java
int[] arr = {10, 20, 30, 20, 50};
int target = 20;
