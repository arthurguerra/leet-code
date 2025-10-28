# Contains Duplicate

## Problem
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Thought Process

### Initial Analysis
- Need to track which numbers we've already seen
- If we encounter a number we've seen before → duplicate found
- If we finish checking all numbers without finding duplicates → no duplicates

### Solution Approach
1. **Create a set** to store numbers we've already encountered
2. **Iterate through the array** of numbers
3. **For each number:**
   - If the number is already in our set → we found a duplicate, return `true`
   - If not in set → add it to the set and continue
4. **If we finish the loop** without finding duplicates → return `false`

### Why This Works
- Sets provide O(1) average lookup time
- We only need to store each unique number once
- As soon as we find a duplicate, we can return immediately

### Time Complexity: O(n)
- Single pass through the array
- Set operations (add/contains) are O(1) average case

### Space Complexity: O(n)
- In worst case (no duplicates), we store all n numbers in the set

## Solutions
- **Java**: [ContainsDuplicate.java](../../src/main/java/arrays_hashing/ContainsDuplicate.java)
- **TypeScript**: [contains-duplicate.ts](./contains-duplicate.ts)