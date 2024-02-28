public class Q5 {
    public static void main(String[] args) {
        int num = 2147483647;
        long s = 1;
        long e = num;

        while (s <= e) {
            long mid = s + (e - s) / 2;
            long multiply = mid * mid;

            System.out.println(multiply);
            if (multiply == num) {
                System.out.println(true);
                break;
                // return num;
            } else if (multiply < num) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        System.out.println(false);
    }
}
