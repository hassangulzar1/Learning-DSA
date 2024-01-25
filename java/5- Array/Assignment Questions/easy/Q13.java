import java.util.Arrays;

public class Q13 {
    static void reversedArr(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }

    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        for (int i = 0; i < image.length; i++) {
            reversedArr(image[i]);

            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(image[0]));
    }
}
