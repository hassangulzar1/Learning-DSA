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

    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

        int[][] rotatedArr = new int[mat.length][mat[0].length];

        boolean yes = true;

        for (int i = 0; i < 4; i++) {
            rotate(rotatedArr, mat);
            mat = rotatedArr;
            rotatedArr = new int[mat.length][mat[0].length];

            for (int j = 0; j < mat.length; j++) {
                if (mat[j] == target[j]) {
                    continue;
                }
            }
        }

        System.out.println(Arrays.toString(mat[2]));
    }
}
