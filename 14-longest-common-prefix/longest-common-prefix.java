class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String word1 = strs[0];
        int length = word1.length();

        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < length){
                length = strs[i].length();
            }    
        }

        outerloop:
        for(int i = 0; i < length; i++){
            char alph = word1.charAt(i);
            
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != alph){
                    break outerloop;
                }
            }
            prefix += alph;
        }
        return prefix;
    }   
}