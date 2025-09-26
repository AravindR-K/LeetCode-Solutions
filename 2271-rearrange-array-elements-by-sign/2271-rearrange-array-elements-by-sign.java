class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int k = 0, j = 0;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        for (int i=0; i<n; i++) {
            if (nums[i] < 0) {
                neg[k] = nums[i]; 
                k++;
            } else {
                pos[j] = nums[i];
                j++;
            }
        }
        j = 0;
        k = 0;
        for (int i=0; i<n; i++) {
            if (i%2 == 0) {
                nums[i] = pos[j];
                j++;
            } else {
                nums[i] = neg[k];
                k++;
            }
        }
        return nums;
    }
}