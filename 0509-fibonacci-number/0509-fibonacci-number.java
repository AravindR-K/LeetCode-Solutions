class Solution {
    public int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = fib(n-1);
        int secPrev = fib(n-2);
        return prev + secPrev;
    }
}