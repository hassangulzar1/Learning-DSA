import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[] arr = { 7, 15, 3, 4, 30 };

        // ! Brute Force solution
        // int multiple[] = new int[arr.length];
        //
        // for (int i = 0; i < arr.length; i++) {
        // multiple[i] = arr[i] * 2;
        // }
        //
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (i != j && multiple[i] == arr[j]) {
        // return true;
        // }
        // }
        // }
        // return false;

        // ! Binary Search Apporch
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            int target = arr[i] * 2;

            int s = 0;
            int e = arr.length - 1;

            while (s <= e) {
                int mid = s + (e - s) / 2;

                if (arr[mid] == target && mid != i) {
                    System.out.println(true);
                    break;
                } else if (arr[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        System.out.println(false);

    }
}
