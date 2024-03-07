import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 10, -19, 4, 6, -8 };

        int multiple[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            multiple[i] = arr[i] * 2;
        }

        int i = 0;
        int j = 0;

        System.out.println(Arrays.toString(multiple));
        while (i < arr.length) {
            if (j == arr.length - 1) {
                j = 0;
                i++;
                continue;
            }

            if (arr[i] == 0 && arr[j] == 0 && i == j) {

            }
            if (arr[i] == multiple[j] && i != j) {
                System.out.println(true);
                break;
            } else {
                j++;
            }

        }

    }
}
