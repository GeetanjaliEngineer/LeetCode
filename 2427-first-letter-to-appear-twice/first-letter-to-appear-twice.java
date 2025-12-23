class Solution {
    public char repeatedCharacter(String s) {
        boolean[] seen = new boolean[256];
        for(char c : s.toCharArray()) {
            if(seen[c]) {
            return  c ;
            }
            seen[c] = true;
        }  
        return ' ';
          }
}