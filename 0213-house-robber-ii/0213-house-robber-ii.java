class Solution {

    public int fFirst(int[] nums, int n, int[] dp) {
        if (n == 0) return nums[0];
        if (n < 0) return 0;
        if (dp[n] != -1) return dp[n];
        int pick = nums[n] + fFirst(nums, n-2, dp);
        int notPick = 0 + fFirst(nums, n-1, dp);
        return dp[n] = Math.max(pick, notPick);
    } 

    public int fEnd(int[] nums, int n, int[] dp) {
        if (n == 1) return nums[1];
        if (n < 1) return 0;
        if (dp[n] != -1) return dp[n];
        int pick = nums[n] + fEnd(nums, n-2, dp);
        int notPick = 0 + fEnd(nums, n-1, dp);
        return dp[n] = Math.max(pick, notPick);
    } 

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(fEnd(nums, n-1, dp1), fFirst(nums, n-2, dp2));
    }
}