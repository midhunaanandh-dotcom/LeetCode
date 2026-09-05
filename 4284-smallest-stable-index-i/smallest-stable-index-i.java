import java.util.Arrays;
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return 0;

        for(int i = 0; i < nums.length; i++){
            int curr = calcMax(Arrays.copyOfRange(nums, 0, i+1)) - calcMin(Arrays.copyOfRange(nums, i, nums.length));
            if (curr <= k) return i;
        }
        return -1;
    }

    public int calcMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int calcMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}