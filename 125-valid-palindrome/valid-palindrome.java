class Solution {
    public boolean isPalindrome(String s) {
        //Lowercase
        //replaceAll
        //loop - for 
        //check if [s left] != s [n-1-i]
        // return false } return true
            s= s.toLowerCase();
            s=   s.replaceAll("[^a-z0-9]", "");
       //loop
            int n = s.length();
            for(int i=0; i<n/2; i++){
                   if(s.charAt(i) != s.charAt(n-1-i)){
                  return false;
             }
          }
          return true;      
    }
}