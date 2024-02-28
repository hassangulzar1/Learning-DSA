import java.util.Arrays;

public class Q4 {

    public static void main(String[] args) {
        int[] numbers = { 3, 24, 50, 79, 88, 150, 345 };
        int target = 200;

        // ! two pointers Approch
        // int s = 0;
        // int e = numbers.length - 1;
        // while (numbers[s] + numbers[e] != target) {
        // if (numbers[s] + numbers[e] < target)
        // s++;
        // else {
        // e--;
        // }
        //
        // }
        // System.out.println(Arrays.toString(new int[] { s + 1, e + 1 }));

        // ! by binary search
        int s = 0;
        int e = numbers.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            int sum = numbers[s] + numbers[e];
            if (sum == target) {
                return new int[] { s + 1, e + 1 };
            } else if (sum < target) {
                if (numbers[e] + numbers[mid] < target) {
                    s = mid + 1;

                } else {
                    s++;
                }
            } else {
                if (numbers[s] + numbers[mid] > target) {
                    e = mid - 1;

                } else {
                    e--;
                }
            }
        }
    }

}
