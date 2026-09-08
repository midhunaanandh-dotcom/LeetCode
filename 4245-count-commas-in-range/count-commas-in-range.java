class Solution {
    public int countCommas(int n) {
        int commas = 0;
        for(int i = 1; i <= n; i++){
            int digits = 0;
            int copy = i;
            while(copy != 0){
                copy /= 10;
                digits++;
            }
            commas += (digits - 1)/3;
        }
        return commas;
    }
}