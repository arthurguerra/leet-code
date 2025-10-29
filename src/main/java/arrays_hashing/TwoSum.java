package arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seenNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int result = target - num;
            if (seenNumbers.containsKey(result)) {
                return new int[] {seenNumbers.get(result), i};
            }
            seenNumbers.put(num, i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] test1 = {2, 7, 11, 15};
        int[] test2 = {3, 2, 4};
        int[] test3 = {3, 3};

        System.out.println("Test 1: " + Arrays.toString(solution.twoSum(test1, 9)));
        System.out.println("Test 2: " + Arrays.toString(solution.twoSum(test2, 6)));
        System.out.println("Test 3: " + Arrays.toString(solution.twoSum(test3, 6)));
    }
}
