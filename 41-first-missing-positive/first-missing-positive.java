class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i =0;

        // Step 1 elements ko unki correct jgh pr lagana 
        //cyclic sort idea 
        //i=0 ,n=nums.length
        while (i < n ){
            if(nums[i] <=0 || nums[i]>n){
            //agar no negative hai ya arr size se bada hia to ignore kro 
            i++;
            continue;
            }

            //correct index where nums[i] should be
            int index = nums[i]-1;

            if(nums[i] != nums[index]){
                // agar current no apni jgh pr ni h to swap krdo 
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index]= temp;

            }else {
                //agar already coorect jgh pr hai to aage badh jao 
                i++;
            }

        }
        // step 2 : ab check kro konsa index missing hai 
        for( i =0; i<n; i++){
            if(nums[i]!= i+1){
                //agar index+1 no ni mila to wahi missing hia 
                return i+1;
            }
        }
        // step 3 : agar 1..n sab present hai to answer hoga n+1

return n+1;
        
    }
}