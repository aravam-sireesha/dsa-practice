import java.util.*;

class Solution {
    static boolean canFormPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;

        // Count odd frequencies
        for (int freq : map.values()) {
            if (freq % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }
}
