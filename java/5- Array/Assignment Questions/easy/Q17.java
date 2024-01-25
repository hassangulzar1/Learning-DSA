import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        System.out.println(Arrays.toString(ans[2]));
    }
}
