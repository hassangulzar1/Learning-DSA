import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int n = 5;

        int mid = n / 2;
        int[] ans = new int[n];
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (i < mid) {
                ans[i] = --count1;

            } else if (i == mid && n != (mid * 2)) {
                count1 = 0;
                ans[i] = count1;
            } else {
                ans[i] = ++count2;
            }

        }

        System.out.println(Arrays.toString(ans));
    }
}
