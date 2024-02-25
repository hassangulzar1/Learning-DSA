public class Q2 {
    static int floor(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return e;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 9, 14, 16, 18 };
        int target = 1;

        System.out.println(floor(arr, target));
    }

}
