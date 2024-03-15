public class Q10 {

    public static boolean check(int[] arr, long target, int h) {

        int hour = 0;
        for (int i = 0; i < arr.length; i++) {
            hour += arr[i] / target + (arr[i] % target == 0 ? 0 : 1);
        }
        if (hour <= h) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        int maxi = 0;
        for (int i = 0; i < piles.length; i++) {
            maxi = Math.max(maxi, piles[i]);
        }

        long s = 1;
        long e = maxi;

        while (s < e) {
            long mid = s + (e - s) / 2;
            if (check(piles, mid, h)) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }

        System.out.println(s);
    }
}
