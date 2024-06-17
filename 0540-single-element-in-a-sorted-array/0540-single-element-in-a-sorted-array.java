class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check boundaries to avoid accessing out of bounds
            if (mid > 0 && nums[mid] == nums[mid - 1]) {
                if ((mid - 1) % 2 == 0) {
                    // If mid-1 is even, the single element is in the left part
                    start = mid + 1;
                } else {
                    end = mid - 2;
                }
            } else if (mid < nums.length - 1 && nums[mid] == nums[mid + 1]) {
                if (mid % 2 == 0) {
                    // If mid is even, the single element is in the right part
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            } else {
                return nums[mid];
            }
        }

        return -1;
    }
}
