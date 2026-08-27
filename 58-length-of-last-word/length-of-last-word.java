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
            return calc(s, s.length() - j);
        }
        return calc(s, s.length());
    }

    public int calc(String s, int start){
        int len = 0;
        for(int i = start - 1; i >= 0; i--){
            if(s.charAt(i) != ' ') len++;
            else break;
        }
        return len;
    }
}