class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            int index = 26 - (curr - 97);
            degree += index*(i+1);
        }
        return degree;
    }
}