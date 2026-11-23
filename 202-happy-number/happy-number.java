class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getSum(n);

        while(fast != 1 && slow != fast){
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }       

        return fast == 1;
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