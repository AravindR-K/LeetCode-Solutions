class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (Integer val : mp.values()) {
            if (max < (int) val) {
                max = (int) val;
            }
        }
        int count = 0;
        for (Integer val : mp.values()) {
            if (max == (int) val) {
                count++;
            }
        }
        return max*count;
    }
}