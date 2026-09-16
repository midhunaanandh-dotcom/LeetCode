class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int i = 0; i < digits.length; i++){
            freq[digits[i]]++;
        }
        
        int count = 0;

        for(int i = 100; i < 1000; i += 2){
            int d1 = i / 100;
            int d2 = (i / 10) % 10;
            int d3 = i % 10;

            if((freq[d1] > 0) && (freq[d2] > ((d1 == d2) ? 1 : 0)) && (freq[d3] > ((d1 == d3 ? 1 : 0) + (d2 == d3 ? 1 : 0)))){
                count++;
            }
        }

        return count;

    }
}