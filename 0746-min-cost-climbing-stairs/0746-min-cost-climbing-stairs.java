class Solution {

    public int f(int n, int[] cost, int[] dp) {
        if (n <= 1) {
            return cost[n];
        }
        if (dp[n] != -1) return dp[n];
        return dp[n] = cost[n] + Math.min(f(n-1, cost, dp), f(n-2, cost, dp));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(f(n-1, cost, dp), f(n-2, cost, dp));
    }
}