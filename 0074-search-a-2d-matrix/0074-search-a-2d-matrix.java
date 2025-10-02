class Solution {
    private boolean binarySearch(int[] row, int target) {
        int left = 0, right = row.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (row[mid] == target) return true;
            else if (row[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1;
        
        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else if (target > matrix[mid][n - 1]) {
                top = mid + 1;
            } else {
                return binarySearch(matrix[mid], target);
            }
        }
        return false;
    }
}