class Solution {

    public boolean f(int i, int sum, int[] nums, int target, int[][] dp) {
        if (i == nums.length) return sum == target;
        if (sum > target) return false;
        if (dp[i][sum] != -1) return dp[i][sum] == 1;

        boolean take = f(i+1, sum + nums[i], nums, target, dp);
        boolean notTake = f(i+1, sum, nums, target, dp);
        dp[i][sum] = (take || notTake) ? 1 : 0;
        return take || notTake;
    } 

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += nums[i];
        }
        int[][] dp = new int[nums.length+1][sum+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        if (sum % 2 == 0) {
            return f(0, 0, nums, sum/2, dp);
        }
        return false;
    }
}