class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;
        
        for (int i = 2; i <= n; i++) {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        
        return thirdTerm;
    }
}
