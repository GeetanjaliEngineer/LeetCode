class Solution {
    public int maxArea(int[] h) {
        int left =0;
        int right = h.length-1;
        int maxArea=0;

        while(left<right){
            // height = min of both sides
            int height = Math.min(h[left], h[right]);
            // width = distance between lines
            int width = right - left;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);

            if(h[left]<h[right]){
                left++;
            } else {
                right--;

            }
        }
        return maxArea;

        
    }
}