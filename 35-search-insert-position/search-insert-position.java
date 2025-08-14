class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // move right
            } else {
                right = mid - 1; // move left
            }
        }
        // If target not found, 'left' will be the insert position
        return left;
    }

}
