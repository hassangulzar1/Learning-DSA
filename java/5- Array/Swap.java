import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 54, 45, 18 };
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            swap(arr, s++, e--);
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}