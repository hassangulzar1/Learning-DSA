import java.util.Arrays;

public class Q25 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 2, c = 4;

        int row = mat.length;
        int col = mat[0].length;

        if (row * col != r * c) {
            System.out.println(mat);
        }
        int[][] ans = new int[r][c];
        int output_row = 0;
        int output_col = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                ans[output_row][output_col] = mat[i][j];
                output_col++;
                if (output_col == c) {
                    output_col = 0;
                    output_row++;

                }
            }
        }

    }
}
