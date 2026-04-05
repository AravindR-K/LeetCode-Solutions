class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        for (int k=0; k<n; k++) {
            if (nums[k] == 0) {
                j = k;
                break;
            }
        }
        if (j == -1) return;

        for (int i=j+1; i<n; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }   
    }
}  