class Solution {
    public int countPalindromes(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();

        long[][] leftPair = new long[10][10];
        long[][] rightPair = new long[10][10];

        int[] leftCount = new int[10];
        int[] rightCount = new int[10];

    
        for (int i = n - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            for (int j = 0; j < 10; j++) {
                rightPair[d][j] += rightCount[j];
            }
            rightCount[d]++;
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int mid = s.charAt(i) - '0';

        
            rightCount[mid]--;
            for (int j = 0; j < 10; j++) {
                rightPair[mid][j] -= rightCount[j];
            }

    
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    ans = (ans + leftPair[a][b] * rightPair[b][a]) % MOD;
                }
            }

    
            for (int j = 0; j < 10; j++) {
                leftPair[j][mid] += leftCount[j];
            }
            leftCount[mid]++;
        }

        return (int) ans;
    }
}
