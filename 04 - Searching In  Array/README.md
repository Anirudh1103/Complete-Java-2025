# 🔍 Linear Search Practice Problems

This repository contains categorized Linear Search practice problems along with their descriptions and sample test cases.

---

## 🟢 Basic Level

### 1. Search for an Element in an Array
**Description:**  
Return the index of the given element using linear search. If not found, return -1.

**Test Cases:**
- Input: `arr = [3, 5, 2, 9, 1], key = 9` → Output: `3`
- Input: `arr = [1, 2, 3, 4, 5], key = 6` → Output: `-1`
- Input: `arr = [10, 20, 30], key = 10` → Output: `0`

---

### 2. Check if an Item Exists in the List
**Description:**  
Print "Yes" if the element exists in the list, else print "No".

**Test Cases:**
- Input: `arr = [7, 8, 9], key = 8` → Output: `Yes`
- Input: `arr = [1, 2, 3], key = 4` → Output: `No`
- Input: `arr = [5], key = 5` → Output: `Yes`

---

### 3. Count Occurrences of an Element
**Description:**  
Return how many times the key appears in the array.

**Test Cases:**
- Input: `arr = [1, 2, 2, 3], key = 2` → Output: `2`
- Input: `arr = [4, 4, 4, 4], key = 4` → Output: `4`
- Input: `arr = [1, 2, 3], key = 5` → Output: `0`

---

### 4. Find First and Last Occurrence
**Description:**  
Return the first and last index of the given key. If not found, return (-1, -1).

**Test Cases:**
- Input: `arr = [1, 2, 2, 3, 2], key = 2` → Output: `(1, 4)`
- Input: `arr = [5, 6, 7], key = 7` → Output: `(2, 2)`
- Input: `arr = [1, 2, 3], key = 4` → Output: `(-1, -1)`

---

### 5. Check if Any Element Equals Its Index
**Description:**  
Return True if any element satisfies `arr[i] == i`.

**Test Cases:**
- Input: `arr = [-1, 0, 2, 4]` → Output: `True`
- Input: `arr = [1, 2, 3]` → Output: `False`
- Input: `arr = [0, 2, 5]` → Output: `True`

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
