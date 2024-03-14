import java.util.Arrays;

public class Q10 {

    public static int check(int[] arr, long target) {

        int index = 0;
        int hour = 0;

        while (index != arr.length) {
            double num1 = arr[index];
            double num2 = target;
            hour += (int) Math.ceil(num1 / num2);

            index++;

        }
        return hour;
    }

    public static void main(String[] args) {
        int[] piles = { 312884470 };
        int h = 312884469;
        Arrays.sort(piles);

        long s = piles[0];
        long e = piles[piles.length - 1];
        int isPossible = -1;

        while (s <= e) {
            long mid = s + (e - s) / 2;
            if (check(piles, mid) <= h) {
                isPossible = (int) mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        System.out.println(isPossible);
    }
}
