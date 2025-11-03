class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int uniqIdx = 0;
        int k = 1;
        for (int duplIdx = 1; duplIdx < n; duplIdx++) {
            if (nums[uniqIdx] != nums[duplIdx]) {
                uniqIdx = duplIdx;
                nums[k] = nums[uniqIdx];
                k++;
            }
        }   
        return k;
    }
}