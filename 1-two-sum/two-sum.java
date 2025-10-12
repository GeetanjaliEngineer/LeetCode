class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Logic 
        //input - 2,7,11,15 target is 9 logic is if index[0] + index[1] == ? [9] 
        //but we use for loop to traverse each array elements so it will go to next element mens 
        // index++
//lets take i and j as elements 
        for(int i=0; i<nums.length;i++ ){
            //j means i++ = i+1 next value if ith index
            for(int j= i+1; j<nums.length; j++){
                // now condition
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}