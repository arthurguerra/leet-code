package arrays_hashing;

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num: nums) {
            if (seenNumbers.contains(num))
                return true;
            seenNumbers.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] test1 = {1,2,3,1};
        int[] test2 = {1,2,3,4};
        int[] test3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println("Test 1: " + solution.hasDuplicate(test1));
        System.out.println("Test 2: " + solution.hasDuplicate(test2));
        System.out.println("Test 3: " + solution.hasDuplicate(test3));
    }
}