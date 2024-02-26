public class Q6 {
    public static void main(String[] args) {

        int[] arr = { 0, 10, 5, 2 };

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        System.out.println(e);
    }
}
