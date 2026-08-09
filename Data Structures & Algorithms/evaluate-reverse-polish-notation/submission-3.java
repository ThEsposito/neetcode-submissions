class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            int rightOperator;
            int leftOperator;

            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    rightOperator= stack.pop();
                    leftOperator = stack.pop();

                    stack.push(leftOperator - rightOperator);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    rightOperator = stack.pop();
                    leftOperator = stack.pop();

                    stack.push(leftOperator / rightOperator);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}
