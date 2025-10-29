function twoSum(nums: number[], target: number): number[] {
    const seenNumbers = new Map<number, number>();
    for (let i = 0; i < nums.length; i++) {
        const result = target - nums[i];
        if (seenNumbers.has(result)) {
            return [seenNumbers.get(result)!, i];
        }
        seenNumbers.set(nums[i], i);
    }
    return [];
}