import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = { { 0, 1 }, { 1, 1 } };

        // int[][] arr = new int[m][n];
        // int countOdd = 0;
        // for (int i = 0; i < indices.length; i++) {
        // int rowIndexIncri = indices[i][0];
        // int colIndexIncri = indices[i][1];
        //
        // for (int j = 0; j < arr[rowIndexIncri].length; j++)
        // arr[rowIndexIncri][j]++;
        //
        // for (int j = 0; j < arr.length; j++)
        // arr[j][colIndexIncri]++;
        //
        // }
        //
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // if (arr[i][j] % 2 != 0)
        // countOdd++;
        // }
        // }
        // System.out.println(countOdd);

        // ! optimise solution
        int[] row = new int[m];
        int[] col = new int[n];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (row[i] + col[j] % 2 == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
