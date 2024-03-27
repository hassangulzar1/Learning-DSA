import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 3, 1, 2 };

        for (int i = 0; i < arr.length; i++) {
            int j = 1;

            while (j < arr.length - i) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}