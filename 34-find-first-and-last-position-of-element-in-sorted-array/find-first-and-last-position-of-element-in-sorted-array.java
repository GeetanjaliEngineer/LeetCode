class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    public int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int fi = -1; // Initialize to -1 for "not found"
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                fi = mid;
                right = mid - 1; // search left side
            } else if (nums[mid] < target) {
                left = mid + 1; // move right
            } else {
                right = mid - 1; // move left
            }
        }
        return fi;
    }

    public int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int li = -1; // Initialize to -1 for "not found"
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                li = mid;
                left = mid + 1; // search right side
            } else if (nums[mid] < target) {
                left = mid + 1; // move right
            } else {
                right = mid - 1; // move left
            }
        }
        return li;
    }
}
