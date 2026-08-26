class Solution {
    public int singleNumber(int[] nums) {
        boolean twinFound = false;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            twinFound = false;
            for(int j = 0; j < nums.length; j++){
                if(temp == nums[j] && i != j){
                    twinFound = true;
                    break;
                }
            }
            if(!twinFound) return temp;
        }
        return -1;
    }
}