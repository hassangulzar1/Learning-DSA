public class Q16 {

    public static boolean findDays(int[] a, int m, int d) {

        int cnt = 1, sum = 0;
        for (int w : a) {
            if (w > m)
                return false;
            if ((sum += w) > m) {
                if (++cnt > d)
                    return false;
                sum = w;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        // if (weights.length == 5 && weights[0] == 500 && weights[weights.length - 1]
        // == 500) {
        // return 1000;
        // }
        int l = 0, r = 500 * weights.length / days;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (findDays(weights, m, days))
                r = m;
            else
                l = m + 1;
        }
        System.out.println(l);

    }
}
