# 🔍 Linear Search Practice Problems

This repository contains categorized Linear Search practice problems along with their descriptions and sample test cases.

---
## 🟡 Medium Level

### 6. Find Smallest and Largest Element
**Description:**  
Find the minimum and maximum element using linear search.

**Test Cases:**
- Input: `arr = [5, 2, 9, 1]` → Output: `Min=1, Max=9`
- Input: `arr = [10, 10, 10]` → Output: `Min=10, Max=10`
- Input: `arr = [-5, 100, 0, 3]` → Output: `Min=-5, Max=100`

---

### 7. Search for Multiple Elements
**Description:**  
Given a list and a list of queries, print "Found" or "Not Found" for each query.

**Test Cases:**
- Input: `arr = [1, 3, 5], queries = [3, 4]` → Output: `["Found", "Not Found"]`
- Input: `arr = [7, 8], queries = [7, 8, 9]` → Output: `["Found", "Found", "Not Found"]`
- Input: `arr = [], queries = [1]` → Output: `["Not Found"]`

---

### 8. Search in a Rotated Sorted Array
**Description:**  
Search for the key using linear search in a rotated sorted array.

**Test Cases:**
- Input: `arr = [4, 5, 6, 1, 2], key = 1` → Output: `3`
- Input: `arr = [10, 20, 30, 5, 7], key = 7` → Output: `4`
- Input: `arr = [6, 7, 8, 9], key = 10` → Output: `-1`

---

### 9. Search in Unsorted Array with Duplicates
**Description:**  
Return all indices where the key is found.

**Test Cases:**
- Input: `arr = [1, 2, 1, 3], key = 1` → Output: `[0, 2]`
- Input: `arr = [4, 4, 4], key = 4` → Output: `[0, 1, 2]`
- Input: `arr = [1, 2, 3], key = 5` → Output: `[]`

---

### 10. Search and Replace
**Description:**  
Replace all occurrences of a key with a given value.

**Test Cases:**
- Input: `arr = [1, 2, 2, 3], key = 2, new = 9` → Output: `[1, 9, 9, 3]`
- Input: `arr = [5], key = 5, new = 0` → Output: `[0]`
- Input: `arr = [1, 3], key = 2, new = 7` → Output: `[1, 3]`

---
> 💡 Tip: All problems can be solved using basic `for` loops and conditions. For extra practice, try to write optimized versions after solving with Linear Search.

---