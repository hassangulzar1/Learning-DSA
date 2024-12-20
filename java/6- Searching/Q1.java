public class Q1 {
    static int ceiling(int[] arr, int target) {

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

        return s;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 9, 14, 16, 18 };
        int target = 4;

        System.out.println(ceiling(arr, target));
    }
}