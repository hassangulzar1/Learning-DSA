import java.util.Arrays;

public class Q13 {

    public static int findRow(int[][] mat, int mid) {
        int highest = Integer.MIN_VALUE;
        int row = -1;

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][mid] > highest) {
                highest = mat[i][mid];
                row = i;

            }
        }
        return row;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 4 }, { 3, 2 } };

        int s = 0;
        int e = mat[0].length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int row = findRow(mat, mid);

            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < mat[0].length ? mat[row][mid + 1] : -1;

            if (mat[row][mid] > left && mat[row][mid] > right) {
                // return new int[] { row, mid };
                System.out.println(Arrays.toString(new int[] { row, mid }));

            } else if (mat[row][mid] < left) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
    }
}
