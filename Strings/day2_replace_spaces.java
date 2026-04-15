// Day 2 POTD
// Problem: Replace spaces with %20
// Approach: Using StringBuilder (optimized)

class Solution {
    String replaceSpaces(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                result.append("%20");
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
