function hasDuplicate(nums: number[]): boolean {
    const numbers = new Set<number>();
    for (const num of nums) {
        if (numbers.has(num)) {
            return true;
        }
        numbers.add(num);
    }
    return false;
}

const test1: number[] = [1, 2, 3, 1];
const test2: number[] = [1, 2, 3, 4];
const test3: number[] = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2];

console.log("Test 1:", hasDuplicate(test1));
console.log("Test 2:", hasDuplicate(test2));
console.log("Test 3:", hasDuplicate(test3));