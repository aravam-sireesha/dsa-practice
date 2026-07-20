class Solution {

    static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = power(5, evenPositions);
        long oddWays = power(4, oddPositions);

        return (int) ((evenWays * oddWays) % MOD);
    }

    private long power(long base, long exp) {

        long result = 1;

        while (exp > 0) {

            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

 
            base = (base * base) % MOD;

            // Divide exponent by 2
            exp >>= 1;
        }

        return result;
    }
}
