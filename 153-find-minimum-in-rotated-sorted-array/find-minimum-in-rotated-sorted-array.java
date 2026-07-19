class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low < high){
            mid = (low+high)/2;
            if(nums[high] > nums[mid]){
                high = mid;
            }else if(nums[high] < nums[mid]){
                low = mid + 1;
            }else if(nums[mid + 1] < nums[mid]){
                return nums[mid+1];
            }else{
                return nums[mid];
            }
        }
        return nums[high];
    }
}