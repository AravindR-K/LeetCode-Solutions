import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int hashArr[] = new int[n+1];
        for (int i=0; i<n; i++) {
            hashArr[nums[i]]++;
        }
        System.out.println(Arrays.toString(hashArr));
        for (int i=0; i<n+1; i++) {
            if (hashArr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}