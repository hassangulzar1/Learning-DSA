import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        };

        int ans = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > ans) {
                ans = sum;
            }
            sum = 0;
        }
        System.out.println(ans);
    }
}
