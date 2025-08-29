class Solution {
    public int[] sortArray(int[] nums) {
        // nums = [10, 9, 1, 1, 1, 2, 3, 1]
        // initial call: mergeSort(nums, 0, 7)
        mergeSort(nums, 0, nums.length - 1);
        return nums; // final sorted array will be returned
    }

    private void mergeSort(int[] arr, int l, int r) {
        // base case: if l >= r, subarray has 0 or 1 element
        if (l >= r) return;

        // find middle index
        int m = l + (r - l) / 2; // dry-run: for l=0, r=7 → m=3

        // recursively sort left half
        mergeSort(arr, l, m); // dry-run: arr[0..3] = [10,9,1,1]

        // recursively sort right half
        mergeSort(arr, m + 1, r); // dry-run: arr[4..7] = [1,2,3,1]

        // merge the two sorted halves
        merge(arr, l, m, r); // dry-run: merge arr[0..3] and arr[4..7]
    }

    private void merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary list to store merged elements

        int i = l;     // pointer for left subarray
        int j = m + 1; // pointer for right subarray

        // merge while both pointers are within their subarrays
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]); // add smaller element from left
                i++;
            } else {
                temp.add(arr[j]); // add smaller element from right
                j++;
            }
        }

        // add remaining elements from left subarray (if any)
        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        // add remaining elements from right subarray (if any)
        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }

        // copy sorted temp array back into original array
        for (int k = l; k <= r; k++) {
            arr[k] = temp.get(k - l);
            // dry-run: for first merge of [10] and [9], l=0, r=1
            // arr[0] = temp[0] = 9, arr[1] = temp[1] = 10
        }
    }
}
