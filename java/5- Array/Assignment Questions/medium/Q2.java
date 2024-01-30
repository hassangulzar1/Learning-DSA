import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int n = 3;

        int[][] ans = new int[n][n];

        int firstRow = 0;
        int lastCol = ans[0].length - 1;

        int lastRow = ans.length - 1;
        int firstCol = 0;

        int i = 1;
        while (i <= n * n) {
            // ! For loop for entering first Row
            for (int j = firstRow; j <= lastCol; j++) {
                ans[firstRow][j] = i++;
            }
            firstRow++;

            // ! For loop for entering last column
            for (int j = firstRow; j <= lastRow; j++) {
                ans[j][lastCol] = i++;
            }
            lastCol--;

            // ! For loop for entering last Row
            for (int j = lastCol; j >= firstCol; j--) {
                ans[lastRow][j] = i++;
            }
            lastRow--;
            // ! For loop for entering first column
            for (int j = lastRow; j >= firstRow; j--) {
                ans[j][firstCol] = i++;
            }
            firstCol++;

        }

        System.out.println(Arrays.toString(ans[1]));
    }
}
