class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
        private void reverse(int num[], int left, int right){
            while(left < right ){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;

              left++;
            right--;
            }
        }
    }
