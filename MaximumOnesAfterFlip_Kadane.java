
class Solution {
    public int maxOnes(int arr[]) {
        int totalOnes = 0;

        // Step 1: Count total 1s
        for (int num : arr) {
            if (num == 1) totalOnes++;
        }

        // Step 2: Apply Kadane's Algorithm
        int maxGain = 0, currentGain = 0;

        for (int num : arr) {
            int value = (num == 0) ? 1 : -1;

            currentGain = Math.max(value, currentGain + value);
            maxGain = Math.max(maxGain, currentGain);
        }

        // Step 3: Final answer
        return totalOnes + maxGain;
    }
} 
