# Two Sum

## Problem
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Thought Process

### Initial Analysis
- Need to find two numbers that sum to target
- Return their indices, not the values themselves
- Each input has exactly one solution
- Can't use same element twice

### Brute Force Approach (Not Used)
Check every pair of numbers - O(n²) time complexity with nested loops.

### Optimal Solution Approach
1. **Use a HashMap/Map** to store numbers we've seen and their indices
2. **For each number**, calculate what its complement should be: `complement = target - current_number`
3. **Check if complement exists** in our map
   - If yes → found the pair, return both indices
   - If no → store current number and index in map, continue
4. **Single pass** through the array is sufficient

### Why This Works
- We're essentially asking: "Have I seen the number that would complete this sum?"
- By storing previous numbers, we can look back in O(1) time
- When we find the complement, we have both indices ready

### Example Walkthrough
Array: [2, 7, 11, 15], Target: 9

- i=0, num=2: complement=7, map is empty → store {2: 0}
- i=1, num=7: complement=2, found 2 in map at index 0 → return [0, 1]

### Time Complexity: O(n)
- Single pass through the array
- HashMap operations (get/put/has) are O(1) average case

### Space Complexity: O(n)
- HashMap stores up to n key-value pairs in worst case

## Solutions
- **Java**: [TwoSum.java](../../src/main/java/arrays_hashing/TwoSum.java)
- **TypeScript**: [two_sum.ts](./two_sum.ts)