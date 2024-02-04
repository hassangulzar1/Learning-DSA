import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // boolean[] rowsToBeZeros = new boolean[matrix.length];
        // boolean[] colsToBeZeros = new boolean[matrix[0].length];
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // if (matrix[i][j] == 0) {
        // rowsToBeZeros[i] = true;
        // colsToBeZeros[j] = true;
        // }
        // }
        //
        // }
        // // ! convert rows to zeros
        // for (int i = 0; i < rowsToBeZeros.length; i++) {
        // if (rowsToBeZeros[i] == true) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // matrix[i][j] = 0;
        // }
        // }
        // }
        // // ! convert cols to zeros
        // for (int i = 0; i < colsToBeZeros.length; i++) {
        // if (colsToBeZeros[i] == true) {
        // for (int j = 0; j < matrix.length; j++) {
        // matrix[j][i] = 0;
        // }
        // }
        //
        // }

        // ! optimise solution
        boolean fr = false, fc = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    if (i == 0)
                        fr = true;
                    if (j == 0)
                        fc = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;

                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (fr) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if (fc) {

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
