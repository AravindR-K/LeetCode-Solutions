class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxCons = 0;
        int dummy = 0;
        for (int i=0; i<n; i++) {
            if (nums[i] == 1) {
                dummy++;
            } else {
                maxCons = Math.max(maxCons, dummy);
                dummy = 0;
            }
        }
        maxCons = Math.max(maxCons, dummy);
        return maxCons;
    }
}