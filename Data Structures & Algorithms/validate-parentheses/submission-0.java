class Solution {
    public boolean isValid(String s) {
                Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening bracket → push onto stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // Closing bracket → check top of stack
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Valid only if no opening brackets are left
        return stack.isEmpty();
    }
}
