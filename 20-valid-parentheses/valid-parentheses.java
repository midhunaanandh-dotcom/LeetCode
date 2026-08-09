class Solution {
    public boolean isValid(String s) {
        int top = -1;
        char[] stack = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '{' || ch == '[' || ch == '('){
                top++;
                stack[top] = ch;
            }else{
                if(top == -1){
                    return false;
                }
                char topChar = stack[top];

                if((ch == '}') && (topChar == '{') || (ch == ']') && (topChar == '[') || (ch == ')') && (topChar == '(')){
                    top--;
                }else{
                    return false;
                }
            }
        }
        if(top == -1) return true;
        return false;
    }
}
