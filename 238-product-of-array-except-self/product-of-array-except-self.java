class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Left products
        // answer[i] = product of all elements to the left of i
        answer[0] = 1; // no element to the left of index 0
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Right products
        // right = product of all elements to the right of i
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right; // left * right
            right = right * nums[i];       // update right for next index
        }

        return answer;
    }
}