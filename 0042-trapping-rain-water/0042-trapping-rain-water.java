    class Solution {
        public int[] findLeftMax(int n, int[] height) {
            int[] leftMaxArr = new int[n];
            int leftMax = height[0];
            leftMaxArr[0] = height[0];
            for (int i=1; i<n; i++) {
                if (leftMax < height[i]) {
                    leftMax = height[i];
                    leftMaxArr[i] = leftMax;
                } else {
                    leftMaxArr[i] = leftMax;
                }
            }
            return leftMaxArr;
        }

        public int[] findRightMax(int n, int[] height) {
            int[] rightMaxArr = new int[n];
            int rightMax = height[n-1];
            rightMaxArr[n-1] = height[n-1];
            for (int i=n-2; i>=0; i--) {
                if (rightMax < height[i]) {
                    rightMax = height[i];
                    rightMaxArr[i] = rightMax;
                } else {
                    rightMaxArr[i] = rightMax;
                }
            }
            return rightMaxArr;
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