public class Q16 {

    public static int findDays(int[] arr, int target) {

    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }

        int s = 0;
        int e = sum;

        while (s < e) {

            int mid = s + (e - s) / 2;

            int daysSum = findDays(weights, mid);

        }
    }
}
