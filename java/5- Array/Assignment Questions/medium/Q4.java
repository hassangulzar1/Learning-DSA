import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        boolean[] rowsToBeZeros = new boolean[matrix.length];
        boolean[] colsToBeZeros = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsToBeZeros[i] = true;
                    colsToBeZeros[j] = true;
                }
            }

        }

        // ! convert rows to zeros
        for (int i = 0; i < rowsToBeZeros.length; i++) {
            if (rowsToBeZeros[i] == true) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // ! convert cols to zeros

        for (int i = 0; i < colsToBeZeros.length; i++) {
            if (colsToBeZeros[i] == true) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }

        }
    }
}
