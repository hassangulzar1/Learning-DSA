public class Q6 {
    public static void main(String[] args) {
        int n = 5;
        long s = 0;
        long e = n;
        while (s <= e) {
            long mid = s + (e - s) / 2;

            if (mid * (mid + 1) / 2 <= n) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        System.out.println(e);
    }
}
