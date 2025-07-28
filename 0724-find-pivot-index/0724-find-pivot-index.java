class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totSum = 0;
        for (int i=0; i<n; i++) {
            totSum += nums[i];
        }
        int leftSum = 0;
        for (int i=0; i<n; i++) {
            int rightSum =  totSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}