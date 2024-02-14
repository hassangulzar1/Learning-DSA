public class Q1 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 9, 14, 16, 18 };
        int target = 4;

        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }

        }
        System.out.println(ans);
    }
}