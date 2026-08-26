class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] alphabets = new int[26]; // Creating an array for each alphabet to tally count

        for(int i = 0; i < s.length(); i++){
            alphabets[s.charAt(i) - 'a']++; // Mapping a to 0, b to 1 and so on...
            alphabets[t.charAt(i) - 'a']--; // By subtracting you make sure they are found once in s and once it t
        }

        for(int i = 0; i < alphabets.length; i++){
            if(alphabets[i] != 0) return false; // If any of it is non zero then it is not an anagram
        }
        return true;

    }
}