import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;

        int lastCol = matrix[0].length - 1;
        int firstCol = 0;

        while (startRow <= endRow && firstCol <= lastCol) {
            for (int i = startRow; i <= lastCol; i++) {
                ans.add(matrix[startRow][i]);
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                ans.add(matrix[i][lastCol]);
            }
            lastCol--;

            if (startRow <= endRow) {
                for (int i = lastCol; i >= firstCol; i--) {
                    ans.add(matrix[endRow][i]);
                }
                endRow--;
            }

            if (firstCol <= lastCol) {
                for (int i = endRow; i >= startRow; i--) {
                    ans.add(matrix[i][firstCol]);
                }
                firstCol++;

            }

        }

        System.out.println(ans);
    }

}
