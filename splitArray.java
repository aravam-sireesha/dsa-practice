class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        
        for (int n : nums) {
            low = Math.max(low, n); 
            high += n;              
        }
        
    
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(nums, k, mid)) {
                high = mid; 
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrays = 1;
        int currSum = 0;
        
        for (int n : nums) {
            currSum += n;
            if (currSum > maxSum) {
                subarrays++;
                currSum = n;
                if (subarrays > k) return false;
            }
        }
        
        return true;
    }
}
