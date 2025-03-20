import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        int n = num.length;
        int carry = k;
        
        for (int i = n - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            ans.addFirst(carry % 10);  // Instead of adding and reversing later
            carry /= 10;
        }
        return ans;
    }
}
