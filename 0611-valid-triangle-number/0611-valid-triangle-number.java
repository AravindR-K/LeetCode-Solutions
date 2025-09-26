class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        for (int longest=n-1; longest>=2; longest--) {
            int left = 0;
            int right = longest-1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[longest]) {
                    count += (right - left);
                    right--;
                }else {
                    left++;
                }
            }
        }
        return count;
    }
}