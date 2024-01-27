import java.util.Arrays;

public class Q20 {
    static void rotate(int[][] arr, int[][] giverArr) {

        for (int i = 0; i < giverArr.length; i++) {

            int first = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                arr[i][first++] = giverArr[j][i];
            }
        }

    }

    static boolean cheacking(int[][] mat, int[][] target) {

        boolean yes = true;
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < target.length; i++) {

                if (mat[i][j] != target[i][j]) {
                    yes = false;
                }

            }
        }

        if (yes) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

        int[][] rotatedArr = new int[mat.length][mat[0].length];

        for (int i = 0; i < 4; i++) {
            rotate(rotatedArr, mat);
            mat = rotatedArr;
            rotatedArr = new int[mat.length][mat[0].length];

            boolean g = cheacking(mat, target);
            if (g) {
                System.out.println(g);
            }
        }

        System.out.println(Arrays.toString(mat[0]));
    }
}
