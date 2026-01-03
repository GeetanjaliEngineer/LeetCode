class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;  
            if (nums[index] < 0) {
                // Already visited → duplicate found
                result.add(Math.abs(num));
            } else {
                // Mark as visited by flipping sign
                nums[index] = -nums[index];
            }
        }
        
        return result;
    }
}
