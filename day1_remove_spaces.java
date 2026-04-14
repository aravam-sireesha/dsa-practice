// Day 1 POTD
// Problem: Remove spaces from string
// Approach: Using StringBuilder (optimized)

class Solution {
    String removeSpaces(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
