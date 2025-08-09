# 🔍 Linear Search Practice Problems

This repository contains categorized Linear Search practice problems along with their descriptions and sample test cases.

---
## 🔴 Hard Level

### 11. Longest Repeating Number Sequence
**Description:**  
Return the number and length of the longest continuous sequence of the same number.

**Test Cases:**
- Input: `arr = [1, 2, 2, 2, 3, 3]` → Output: `(2, 3)`
- Input: `arr = [4, 4, 4, 4, 4]` → Output: `(4, 5)`
- Input: `arr = [1, 2, 3]` → Output: `(1, 1)`

---

### 12. Find Majority Element (More than n/2 times)
**Description:**  
Return the element that occurs more than n/2 times using linear logic. If none, return `None`.

**Test Cases:**
- Input: `arr = [3, 3, 4, 2, 3]` → Output: `3`
- Input: `arr = [1, 2, 3]` → Output: `None`
- Input: `arr = [2, 2, 2, 1, 1]` → Output: `2`

---

### 13. Find Missing Number from 1 to n
**Description:**  
Given a list of size `n-1` with numbers from `1` to `n`, find the missing number.

**Test Cases:**
- Input: `arr = [1, 2, 4], n = 4` → Output: `3`
- Input: `arr = [2, 3, 4, 5], n = 5` → Output: `1`
- Input: `arr = [1, 2, 3, 4, 5, 6, 7, 9], n = 9` → Output: `8`

---

### 14. First Non-Repeating Element
**Description:**  
Return the first element that does not repeat in the list.

**Test Cases:**
- Input: `arr = [1, 2, 2, 3, 1]` → Output: `3`
- Input: `arr = [4, 5, 4, 5, 6]` → Output: `6`
- Input: `arr = [7, 7, 7]` → Output: `None`

---

### 15. Sparse Linear Search (with empty strings)
**Description:**  
Find the index of a given string in a list that includes empty strings.

**Test Cases:**
- Input: `arr = ["", "cat", "", "", "dog"], key = "dog"` → Output: `4`
- Input: `arr = ["", "", "", "apple"], key = "apple"` → Output: `3`
- Input: `arr = ["", "", "", ""], key = "test"` → Output: `-1`

---
> 💡 Tip: All problems can be solved using basic `for` loops and conditions. For extra practice, try to write optimized versions after solving with Linear Search.

---