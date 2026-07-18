class Solution {// stack answrer
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();// stack technique 
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {// start checking
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) { // end checking for paraentheses 
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}