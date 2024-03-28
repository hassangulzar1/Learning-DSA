import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 4, 1, 2 };

        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSorted = true;
                }
            }
            if (!isSorted) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}