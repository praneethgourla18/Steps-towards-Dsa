class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);
        
        // Search in the ascending part
        int leftSearch = binarySearch(mountainArr, 0, peak, target, true);
        
        // Search in the descending part
        int rightSearch = binarySearch(mountainArr, peak + 1, n - 1, target, false);
        
        // Return the minimum index found
        if (leftSearch != -1 && rightSearch != -1) {
            return Math.min(leftSearch, rightSearch);
        }
        return Math.max(leftSearch, rightSearch);
    }
    
    private int findPeak(MountainArray mountainArr, int n) {
        int start = 0;
        int end = n - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // Peak index
    }
    
    private int binarySearch(MountainArray mountainArr, int start, int end, int target, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                return mid;
            }
            
            if (isAscending) {
                if (midValue < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (midValue < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}
