public class Q16 {

    // public static int findDays(int[] arr, int target, int givenDays) {
    //
    // int index = 0;
    //
    // int sum = 0;
    // int days = 1;
    //
    // while (index < arr.length) {
    //
    // if (sum + arr[index] <= target) {
    // sum += arr[index++];
    //
    // } else if (arr[index] > target) {
    // return givenDays + 1;
    // } else {
    // sum = 0;
    // days++;
    // }
    // }
    // return days;
    // }
    public static boolean findDays(int[] arr, int target, int givenDays) {

        int count = 1,
                sum = 0;

        for (int i : arr) {
            if (i > target) {

                return false;
            }

            if ((sum += i) > target) {
                if (++count > givenDays) {
                    return false;
                }

                sum = i;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        int s = 0;
        int e = 500 * weights.length / days;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (findDays(weights, mid, days)) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(s);

    }
}
