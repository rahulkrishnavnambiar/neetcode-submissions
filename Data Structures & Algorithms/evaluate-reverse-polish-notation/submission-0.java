class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            // If token is a number
            if (!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")) {

                stack.push(Integer.parseInt(token));
            }

            // If token is an operator
            else {
                int right = stack.pop();
                int left = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(left + right);
                        break;

                    case "-":
                        stack.push(left - right);
                        break;

                    case "*":
                        stack.push(left * right);
                        break;

                    case "/":
                        stack.push(left / right);
                        break;
                }
            }
        }

        return stack.peek();
    }
}