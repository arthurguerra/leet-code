# Valid Anagram

## Problem
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a word formed by rearranging the letters of another word, using all letters exactly once.

## Thought Process

### Initial Analysis
- Two strings are anagrams if they contain the same characters with the same frequencies
- Need to check if both strings have identical character composition
- Order doesn't matter, only the characters and their counts

### Solution Approach
1. **Early exit**: If strings have different lengths → not anagrams
2. **Convert to character arrays**: Split both strings into individual characters
3. **Sort both arrays**: Rearrange characters in alphabetical order
4. **Compare sorted arrays**: If identical → anagrams, otherwise not

### Why This Works
- Sorting puts characters in consistent order
- Anagrams will have identical sorted representations
- Non-anagrams will have different sorted representations
- Handles all edge cases automatically

### Alternative Approach Considered
Initially thought about removing characters from one array while iterating through the other, but sorting approach is cleaner and more intuitive.

### Time Complexity: O(n log n)
- Sorting both character arrays dominates the time complexity
- String splitting and comparison are O(n)

### Space Complexity: O(n)
- Creating two character arrays of size n
- Sorting typically uses O(log n) additional space

### Follow-up: Unicode Support
This solution naturally handles Unicode characters (accented letters, symbols, emojis) without any modifications, unlike frequency counting approaches that assume only a-z.

## Solutions
- **Java**: [ValidAnagram.java](../../src/main/java/valid_anagram/ValidAnagram.java)
- **TypeScript**: [valid-anagram.ts](./valid-anagram.ts)