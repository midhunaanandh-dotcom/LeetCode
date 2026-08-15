int findLengthOfLCIS(int* nums, int numsSize) {
    int max = 1;
    int longest = 1;
    for(int i = 0; i < numsSize-1; i++){
        if(nums[i] < nums[i+1]){
            longest++;
            if(longest > max) max = longest;
        }else{
            longest = 1;
        }
    }
    return max;
}