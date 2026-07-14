class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(); // Since String is immutable in java we use StringBuilder to occupy less memory
        String word1 = strs[0];
        int length = word1.length();

        // Edge cases: when strs is null that is there's no String object and when the array is empty
        if(strs == null || strs.length == 0){
            return "";
        }

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
            prefix.append(alph);
        }
        return prefix.toString(); // .toString() converts object into a plain string
    }   
}