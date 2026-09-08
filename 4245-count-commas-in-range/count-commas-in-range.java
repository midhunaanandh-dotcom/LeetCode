class Solution {
    public int countCommas(int n) {
        int commas = 0;
        for(int i = 1; i <= n; i++){
            commas += countComma(i);
        }
        return commas;
    }
    public int countComma(int number){
        int digits = 0;
        while(number != 0){
            number /= 10;
            digits++;
        }

        return (digits-1)/3;
    }
}