class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        long maxSum = 0;
        long windowSum = 0;

        int start = 0;

        for (int end = 0; end < n; end++) {

            // Remove duplicates until nums[end] is not in the set
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                windowSum -= nums[start];
                start++;
            }

            // Add current element
            set.add(nums[end]);
            windowSum += nums[end];

            // If window size exceeds k, shrink it
            if (end - start + 1 > k) {
                set.remove(nums[start]);
                windowSum -= nums[start];
                start++;
            }

            // When window size is exactly k, check answer
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}
