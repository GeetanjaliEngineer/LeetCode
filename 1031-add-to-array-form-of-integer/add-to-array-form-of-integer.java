class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
          int n = num.length;
        int carry = k;
        List<Integer> ans = new ArrayList<>();
        
        int i = n;
        while (--i >= 0 || carry > 0) {
            if ( i >= 0)
            {
                carry += num[i];
            }        
            ans.add(carry % 10);
            carry = carry / 10;
        }
        Collections.reverse(ans);
        return ans;
    




    }
}