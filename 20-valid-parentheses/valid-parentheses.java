class Solution {
    public boolean isValid(String s) {
        int top = 0;
        char[] stack = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '{' || ch == '[' || ch == '('){
                stack[top++] = ch;
            }else{
                if(top == 0){
                    return false;
                }
                char topChar = stack[top - 1];

                if((ch == '}') && (topChar == '{') || (ch == ']') && (topChar == '[') || (ch == ')') && (topChar == '(')){
                    top--;
                }else{
                    return false;
                }
            }
        }
        return (top == 0);
    }
}
