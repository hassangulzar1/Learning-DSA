import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q26 {
    public static void main(String[] args) {
        int[] digits = { 9 };
        // ! BruteForce Solution
        // List<Integer> list = new ArrayList<>();
        //
        // int carry = 0;
        // int k = 1;
        // for (int i = digits.length - 1; i >= 0; i--) {
        //
        // int sum = digits[i] + k + carry;
        // k = 0;
        // int val = sum % 10;
        // sum /= 10;
        // carry = sum;
        // list.add(0, val);
        //
        // }
        //
        // while (carry > 0) {
        // list.add(0, carry--);
        // }
        // int[] ans = new int[list.size()];
        // for (int i = 0; i < ans.length; i++) {
        // ans[i] = list.get(i);
        // }
        //
        // System.out.println(Arrays.toString(ans));

        // ! Optimise solution
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                // return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];

        digits[0] = 1;
        // return digits;

    }
}
