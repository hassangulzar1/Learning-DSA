import java.util.Arrays;

public class CyclicSort {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 3 };
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
