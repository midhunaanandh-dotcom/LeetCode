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
            if(iter > 1000) break;
            iter++;
        }
        return false;        
    }
    public int getSum(int n){
        int sum  = 0;
        int copy = n;
        while(copy > 0){
            sum += (copy%10) * (copy%10);
            copy = copy/10;
        }   
        return sum;
    }
}