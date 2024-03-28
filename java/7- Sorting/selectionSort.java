import java.util.Arrays;

public class selectionSort {
    public static int getMaxIndex(int[] arr, int s, int e) {
        int max = s;

        for (int i = s; i <= e; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }

        System.out.println(Arrays.toString(arr));
    }
}
