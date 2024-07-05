class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    static int binarySearch(int[] nums,int target, int s,int e){
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (nums[m] == target) {
            return m;
        }
        if (target < nums[m]) {
            return binarySearch(nums, target, s, m - 1);
        }
        return binarySearch(nums, target, m + 1, e);
    }
}