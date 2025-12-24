class Solution {
    public char repeatedCharacter(String s) {
        boolean[] seen = new boolean[26];  // only lowercase letters

        for (char ch : s.toCharArray()) {
            if (seen[ch - 'a']) {
                return ch;   // first repeated character
            }
            seen[ch - 'a'] = true;
        }
        return ' '; // never reached as per problem constraints
    }
}
