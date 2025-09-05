class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set current window ke characters ko store karega
        HashSet<Character> set = new HashSet<>();

        int left = 0;      // window ka start index
        int maxLen = 0;    // longest substring length (answer)

        // right pointer se string traverse karenge
        for (int right = 0; right < s.length(); right++) {

            // Agar current char already set me hai (duplicate mila)
            // to window ko shrink karenge left side se
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++; // window ko ek step slide karo
            }

            // ab duplicate hat chuka hai, to current char add kar do
            set.add(s.charAt(right));

            // window ka size = (right - left + 1)
            maxLen = Math.max(maxLen, right - left + 1);

            // \U0001f539 Dry Run Example: s = "zxyzxyz"
            // right=0: add z → set={z}, maxLen=1
            // right=1: add x → set={z,x}, maxLen=2
            // right=2: add y → set={z,x,y}, maxLen=3
            // right=3: duplicate 'z' → remove left chars until z removed
            //          window becomes {x,y}, then add z → {x,y,z}, maxLen=3
            // right=4,5,6 similarly → maxLen=3
        }

        return maxLen;
    }
}
