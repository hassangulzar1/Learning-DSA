import java.util.ArrayList;
import java.util.List;

public class Q23 {
    static int minElementIndex(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        return index;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };

        for (int i = 0; i < matrix.length; i++) {
            int minElmIndex = minElementIndex(matrix[i]);

            int yes = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (i == j)
                    continue;

                if (matrix[i][minElmIndex] > matrix[j][minElmIndex]) {
                    yes++;
                }
            }

            if (yes == matrix.length - 1) {
                List<Integer> myList = new ArrayList<>();
                myList.add(matrix[i][minElmIndex]);
                System.out.println(myList);
            }
        }

        System.out.println(new ArrayList<>());
    }
}
