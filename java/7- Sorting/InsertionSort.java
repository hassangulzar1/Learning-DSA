import java.util.Arrays;

public class InsertionSort {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
