import java.util.Arrays;

class Solution {
    public int f(int idx, int[] nums, int[] dp) {
        if (idx == 0) return nums[idx];
        if (idx < 0) return 0;
        if (dp[idx] != -1) return dp[idx];
        int pick = nums[idx] + f(idx-2, nums, dp);
        int notPick = 0 + f(idx-1, nums, dp);
        return dp[idx] = Math.max(pick, notPick);  
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1); 

        return f(n-1, nums, dp);
    }
}