class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int d = 0;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                d = i;
                found = true;
                break;
            }
        }

        if (!found) {
            return true;
        }

        for (int i = d; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        if (nums[n - 1] > nums[0]) {
            return false;
        }

        return true;
    }
}