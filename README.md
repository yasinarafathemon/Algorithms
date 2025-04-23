# Lexicographically Smallest and Longest Common Subsequence

This project was developed as part of the **Algorithms (CSE246)** course at East West University.

## 📌 Project Overview

The objective of this project is to:
- Find the **length** of the Longest Common Subsequence (LCS)
- Identify the **lexicographically smallest** LCS between two input strings

## 🧠 Problem Statement

Given two ASCII strings, determine their LCS and the smallest LCS in lexicographical order.

Example:
```
Input: str1 = "ABCDEF", str2 = "DEFABC"
Output: Length = 3, LCS = "ABC"
```

## 🧮 Algorithm Description

- A dynamic programming (DP) table of size `(m+1) x (n+1)` is used.
- If characters match, increment the LCS length by 1 (diagonal move).
- If not, take the max value from the top or left cell.
- Construct the LCS string by tracing back from the bottom-right of the table.

## 🧪 Input/Output Format

Input: Two ASCII strings  
Output: Length of LCS and the lexicographically smallest LCS string

## 🧩 Complexity Analysis

- **Time Complexity**: O(m × n)
- **Space Complexity**: O(m × n)

## 🔧 Implementation Notes

- The LCS is built using bottom-up dynamic programming.
- A StringBuilder is used to efficiently construct the LCS.
- Final LCS is reversed before printing.

## 💡 Applications

Lexicographical ordering is commonly used in:
- Dictionary-based algorithms
- Search and sort functionalities
- NLP and bioinformatics

## 👨‍💻 Authors

- Miftahul Kamal Jannat (2020-1-60-231)
- Sadia Islam Maria (2020-1-60-276)
- MD. Yeasin Arafath Emon (2020-2-60-182)

## 🧑‍🏫 Supervisor

Redwan Ahmed Rizvee  
Lecturer, Dept. of CSE, East West University

📅 **Submission Date**: 28 December, 2022
