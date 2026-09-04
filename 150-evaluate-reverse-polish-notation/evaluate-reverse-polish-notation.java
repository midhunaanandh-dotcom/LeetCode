class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = 0;

        for(int i = 0; i < tokens.length; i++){
            String curr = tokens[i];
            int num1, num2, result;
            switch(curr){
                case "+":
                    num2 = stack[--top];
                    num1 = stack[--top];
                    result = num1 + num2;
                    stack[top++] = result;
                    break;
                case "-":
                    num2 = stack[--top];
                    num1 = stack[--top];
                    result = num1 - num2;
                    stack[top++] = result;
                    break;
                case "*":
                    num2 = stack[--top];
                    num1 = stack[--top];
                    result = num1 * num2;
                    stack[top++] = result;
                    break;
                case "/":
                    num2 = stack[--top];
                    num1 = stack[--top];
                    result = num1 / num2;
                    stack[top++] = result;
                    break;
                default:
                    stack[top++] = Integer.parseInt(curr);
            }
        }
        
    return stack[--top];
    }
}