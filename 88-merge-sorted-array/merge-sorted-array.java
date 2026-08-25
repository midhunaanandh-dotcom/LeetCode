class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for(int j = 0; j < n; j++){
                nums1[j] = nums2[j];
            }
            return;
        }
        if(n == 0){
            return;
        }

        int size = m;   
        for(int j = 0; j < n; j++){
            boolean inserted = false;
            for(int i = 0; i < size; i++){
                if(nums1[i] > nums2[j]){
                    for(int k = size-1; k >= i; k--){
                        nums1[k+1] = nums1[k];
                    }
                    nums1[i] = nums2[j];
                    size++;
                    inserted = true;
                    break;
                }
            }
            if(!inserted){
                    nums1[size] = nums2[j];
                    size++;
                }
        }
    }
}