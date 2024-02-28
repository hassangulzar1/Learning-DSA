public class Q7 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        // ! linear Search
        // int index = 0;
        // for (int i = 1; i <= arr[arr.length - 1]; i++) {
        // if (arr[index] != i) {
        // k--;
        // if (k == 0)
        // return i;
        // } else {
        // index++;
        // }
        // }

        // !Binary Search

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] - mid - 1 < k) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }

        }

        System.out.println(s + k);
    }
}
