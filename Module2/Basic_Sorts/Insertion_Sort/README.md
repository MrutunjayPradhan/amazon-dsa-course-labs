# 🧮 Insertion Sort Activity – Module 2

### 📂 Path
`Module2/Basic_Sorts/Insertion_sort/Activity.java`

---

## 📘 Challenge Description

Implement the **Insertion Sort algorithm** to sort a list of names in **reverse alphabetical order** (descending).

### 🔤 Input
An array of names:  
`{"Augusta", "Ria", "Jodee", "Sophia", "James"}`

---

## 🎯 Objective

Sort the names in **descending** (reverse alphabetical) order using Insertion Sort and display them as:

Sorted names in reverse order: Sophia Ria Jodee James Augusta

---

## ✅ Requirements

- Start from the second element in the array (`index = 1`).
- Compare each element (`key`) with elements before it and shift the larger ones rightward.
- Insert the key at its correct position.
- Sort in **descending** order using `compareTo()` method.

---

## 💡 Reflection Points

- 🔁 **Correct loop bounds**: Inner loop should run as long as `currentName.compareTo(previousName) > 0`.
- 🧱 **Element shift**: Proper shifting of elements to make room for the key is crucial.
- 🧠 **Variable clarity**: Use meaningful names like `currentIndex`, `previousIndex`, and `currentName`.

---

## 📌 Sample Output
Sorted names in reverse order: Sophia Ria Jodee James Augusta

---

## 🧠 Key Learning

- Reinforced understanding of **Insertion Sort** for strings.
- Practiced string comparison logic using `compareTo()`.
- Developed logic to sort in descending order efficiently.
- Strengthened debugging skills around loop logic and array manipulation.

---

## 👨‍💻 Author

Mrutunjay Pradhan | [GitHub Profile](https://github.com/MrutunjayPradhan)

