public class Q1 {
    public static void main(String[] args) {

        int x = 2147395599;
        if (x == 0) {
            // return 0;
            System.out.println(0);
        }

        int s = 1;
        int e = x;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid > x / mid) {
                e = mid - 1;
            } else if (mid < x / 2) {
                s = mid + 1;

            } else {
                // return mid;
                System.out.println(mid);
            }

        }

        // return e;
        System.out.println(e);
    }

}
