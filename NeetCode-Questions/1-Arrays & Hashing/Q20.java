import java.util.Stack;

public class Q20 {
    public static void main(String[] args) {
        String s = "()[]{}";

        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {

            if (bracket == '(') {
                stack.push(')');
            } else if (bracket == '[') {
                stack.push(']');
            } else if (bracket == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || stack.peek() != bracket) {
                    // return false;
                } else {
                    stack.pop();
                }
            }
        }

        System.out.println(stack.size());

    }
}
