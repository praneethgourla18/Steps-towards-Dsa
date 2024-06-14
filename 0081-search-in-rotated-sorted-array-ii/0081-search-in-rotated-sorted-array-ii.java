class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

           if (nums == null || nums.length == 0) {
            return false; // Edge case: empty array
           }

        while (start <= end) {
            
             int mid = start + (end - start) / 2;

          

            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }
            

            if (nums[mid] == target) {
                return true;
            }

            else if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}