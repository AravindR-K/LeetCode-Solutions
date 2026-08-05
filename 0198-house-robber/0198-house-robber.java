class Solution {

    public int f(int[] nums, int n, int[] arr) {
        if (n == 0) return nums[n];
        if (n < 0) return 0;
        if (arr[n] != -1) return arr[n];
        int pick = nums[n] + f(nums, n-2, arr);
        int notPick = 0 + f(nums, n-1, arr);
        return arr[n] = Math.max(pick, notPick);
    }

    public int rob(int[] nums) {
        int n = nums.length-1;
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        return f(nums, n, arr);
    }
}