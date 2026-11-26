class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
    }
    public void quicksort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quicksort(arr, low, p);
            quicksort(arr, p+1, high);
        }

    }
    public int partition(int[] arr, int low, int high){
        int p = arr[low];
        int i = low - 1;
        int j = high + 1;
        while(true){
            do{
                i++;
            }while(p > arr[i]);

            do{
                j--;
            }while(p < arr[j]);

            if(i >= j){
                return j;
            }  
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}