public class Q10 {
    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;

            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[e]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] rotatedArr = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };

        int pivot = findPivot(rotatedArr);
        System.out.println(pivot + 1);
    }

}
