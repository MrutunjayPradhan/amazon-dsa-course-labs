# 🧠 Merge Sort by String Length – Advanced Sorting (Module 2)

### 📂 Path
`Module2/Basic_Sorts/Advanced_sorting/Activity.java`

---

## 📘 Challenge Description

Use the **Merge Sort algorithm** to sort an array of strings by their **length**, in **ascending order**.  
Instead of comparing numerical values, compare the **length of each string** during the merge step.

---

## 🧾 Input Data

```java
String[] arr = {"apple", "banana", "kiwi", "grapefruit", "pear", "orange"};
````

---

## 🎯 Objective

Sort the above array based on string length to produce the following output:

```
kiwi
pear
apple
banana
orange
grapefruit
```

---

## 🧪 Implementation Requirements

* Implement a recursive `mergeSort2()` method.
* Implement `merge2()` to merge based on **string length** comparison.
* Preserve stable sorting (i.e., maintain relative order of same-length strings).

---

## 📌 Sample Output

```
kiwi
pear
apple
banana
orange
grapefruit
```

---

## ⚙️ Core Concepts Used

* ✅ **Divide and Conquer**: Recursive breakdown of the problem into subarrays.
* 🧮 **Custom Comparison**: Used `.length()` to compare string sizes instead of values.
* 🔁 **Stable Sorting**: Maintained order of equal-length elements.

---

## 🧠 Reflection & Debugging Tips

* Check recursive base condition (`start < end`) to avoid `StackOverflowError`.
* Carefully manage left/mid/right index math to prevent off-by-one errors.
* Use helper print statements or debuggers to check array state during recursion.

---

## 👨‍💻 Author

Mrutunjay Pradhan | [GitHub Profile](https://github.com/MrutunjayPradhan)


---
