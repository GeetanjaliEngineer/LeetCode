class Solution {
    public int findDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            int count = 0;
            // Count how many numbers are <= mid
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            // If count > mid, duplicate is in [start, mid]
            if (count > mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
