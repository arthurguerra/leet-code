package arrays_hashing;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        return Arrays.equals(arrayS, arrayT);
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        String test1Word1 = "anagram";
        String test1Word2 = "nagaram";

        System.out.println("Test 1: " + solution.isAnagram(test1Word1, test1Word2));

        String test2Word1 = "rat";
        String test2Word2 = "car";

        System.out.println("Test 2: " + solution.isAnagram(test2Word1, test2Word2));
    }
}
