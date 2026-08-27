class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        char lastChar = s.charAt(s.length() - 1);

        if(lastChar == ' '){
            int j = 0;
            for(int i = s.length() - 1; i >= 0; i--){
                if(s.charAt(i) != ' ') break;
                else j++;
            }
            for(int k = s.length() - 1 - j; k >= 0; k--){
                if(s.charAt(k) != ' ') len++;
                else break;
            }
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' ') len++;
            else break;
        }
        return len;
    }
}