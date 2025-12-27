class Solution {
    public int climbStairs(int n) {
        //base case 
        if (n <= 2)
            return n;
            // f(n)=f(n-1)+f(n-2)
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            //swapping
            first = second;
            second = third;

        }
        return second;

    }
}