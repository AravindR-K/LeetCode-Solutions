    class Solution {
        
        public int[] findLeftMax(int n, int[] height) {
            int[] leftArr = new int[n];
            leftArr[0] = height[0];
            for (int i=1; i<n; i++) {
                leftArr[i] = Math.max(leftArr[i-1], height[i]);
            }
            return leftArr;
        }

        public int[] findRightMax(int n, int[] height) {
            int[] rightArr = new int[n];
            rightArr[n-1] = height[n-1];
            for (int i=n-2; i>=0; i--) {
                rightArr[i] = Math.max(rightArr[i+1], height[i]);
            }
            return rightArr;
        }

        public int trap(int[] height) {
        int n = height.length;
        int area = 0;
        int[] leftMax = findLeftMax(n, height);
        int[] rightMax = findRightMax(n, height);
        for (int i=0; i<n; i++) {
            if (height[i] < leftMax[i] && height[i] < rightMax[i]) {
                area += Math.min(leftMax[i], rightMax[i]) - height[i];
            }
        }
        return area;
        }
    }