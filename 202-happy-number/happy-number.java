class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        int result = n;
        int iter = 0;
        while(result != 1){
            result = getSum(result);
            if(result == 1){
                return true;
            }
            if(iter > 50) break;
            iter++;
        }
        return false;        
    }
    public int getSum(int n){
        int sum  = 0;
        while(n > 0){
            sum += (n%10) * (n%10);
            n = n/10;
        }   
        return sum;
    }
}