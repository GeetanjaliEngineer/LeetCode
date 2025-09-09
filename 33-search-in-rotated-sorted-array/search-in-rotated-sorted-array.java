class Solution {
    public int search(int[] nums, int target) {
        for(int i =0; i<nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }

            return -1;
        }
}

    //     int left =0, right = nums.length-1;

    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;

    //         if (nums[mid] == target) {
    //             return mid; // target found
    //         }

    //         // Left half is sorted
    //         if (nums[left] <= nums[mid]) {
    //             if (nums[left] <= target && target < nums[mid]) {
    //                 right = mid - 1; // search left half
    //             } else {
    //                 left = mid + 1; // search right half
    //             }
    //         }
    //         // Right half is sorted
    //         else {
    //             if (nums[mid] < target && target <= nums[right]) {
    //                 left = mid + 1; // search right half
    //             } else {
    //                 right = mid - 1; // search left half
    //             }
    //         }
    //     }
    //     return -1; // not found
    // }
    // }

    




