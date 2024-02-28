public class Q3 {
    public static void main(String[] args) {
        int n = 5;
        int s = 1;
        int e = n;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (isBadVersion(mid)) {
                e = mid;
            } else {
                s = mid + 1;
            }

        }
        return e;
    }
}
