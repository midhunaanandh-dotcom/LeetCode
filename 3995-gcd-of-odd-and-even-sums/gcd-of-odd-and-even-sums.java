class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = sumOdd(n);
        int b = sumEven(n);
        // System.out.println(a + " " + b);
        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public int sumOdd(int n){
        int sum = 0;    
        for(int i = 1; i <= n; i++){
            sum += (2*i - 1);
        }
        
        return sum;
    }
    public int sumEven(int n){
        int sum = 0;    
        for(int i = 1; i <= n; i++){
            sum += (2*i);
        }
        return sum;
    }
}