class Solution {
 
    public boolean isPalindrome(String s) {
        // 1 Convert the string to lowercase
        s = s.toLowerCase();

        // 2 Keep only alphanumeric characters (a-z, 0-9)
        s = s.replaceAll("[^a-z0-9]", "");

        // 3 Two-pointer check
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
