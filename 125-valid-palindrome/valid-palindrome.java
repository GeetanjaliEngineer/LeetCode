public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left to next alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right to previous alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare ignoring case
            char cLeft = Character.toLowerCase(s.charAt(left));
            char cRight = Character.toLowerCase(s.charAt(right));
            if (cLeft != cRight) return false;

            left++;
            right--;
        }
        return true;
    }
}
