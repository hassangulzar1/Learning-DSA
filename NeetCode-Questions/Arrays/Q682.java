import java.util.ArrayList;

public class Q682 {
    public static void main(String[] args) {
        String[] ops = { "5", "2", "C", "D", "+" };

        ArrayList<Integer> stack = new ArrayList<Integer>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.remove(stack.size() - 1);
            } else if (op.equals("D")) {
                int prevVal = stack.get(stack.size() - 1);
                stack.add(prevVal * 2);
            } else if (op.equals("+")) {
                int firstPrev = stack.get(stack.size() - 1);
                int secondPrev = stack.get(stack.size() - 2);
                stack.add(firstPrev + secondPrev);
            } else {
                stack.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int i : stack) {
            sum += i;
        }
    }
}
