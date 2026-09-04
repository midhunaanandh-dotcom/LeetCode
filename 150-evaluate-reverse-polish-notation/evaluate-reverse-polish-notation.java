class Solution {
    public int evalRPN(String[] tokens) {
        String[] stack = new String[tokens.length];
        int top = 0;

        for(int i = 0; i < tokens.length; i++){
            String curr = tokens[i];
            int num1, num2, result;
            switch(curr){
                case "+":
                    num2 = Integer.parseInt(stack[--top]);
                    num1 = Integer.parseInt(stack[--top]);
                    result = num1 + num2;
                    stack[top++] = String.valueOf(result);
                    break;
                case "-":
                    num2 = Integer.parseInt(stack[--top]);
                    num1 = Integer.parseInt(stack[--top]);
                    result = num1 - num2;
                    stack[top++] = String.valueOf(result);
                    break;
                case "*":
                    num2 = Integer.parseInt(stack[--top]);
                    num1 = Integer.parseInt(stack[--top]);
                    result = num1 * num2;
                    stack[top++] = String.valueOf(result);
                    break;
                case "/":
                    num2 = Integer.parseInt(stack[--top]);
                    num1 = Integer.parseInt(stack[--top]);
                    result = num1 / num2;
                    stack[top++] = String.valueOf(result);
                    break;
                default:
                    stack[top++] = curr;
            }
        }
        
    return Integer.parseInt(stack[--top]);
    }
}