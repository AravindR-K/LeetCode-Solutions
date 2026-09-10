class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int MaxArea = 0;
        while (left < right) {
            int width = right - left;
            int leftHeight = height[left];
            int rightHeight = height[right];
            int currentArea = Math.min(height[left], height[right]) * width;
            MaxArea = Math.max(MaxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return MaxArea;
    }
}