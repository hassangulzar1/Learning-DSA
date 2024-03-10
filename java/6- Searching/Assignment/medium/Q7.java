import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q7 {

    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        int isPossible = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                isPossible = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return isPossible;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 4 }, { 2, 3 }, { 3, 4 } };
        int[] allStarts = new int[intervals.length];
        int[] ans = new int[intervals.length];

        for (int i = 0; i < ans.length; i++) {
            allStarts[i] = intervals[i][0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ans.length; i++) {
            map.put(allStarts[i], i);
        }
        Arrays.sort(allStarts);

        for (int i = 0; i < ans.length; i++) {
            int val = binarySearch(allStarts, intervals[i][1]);

            if (val == -1) {
                ans[i] = -1;
            } else {
                ans[i] = map.get(allStarts[val]);
            }

        }

        System.out.println(Arrays.toString(ans));
    }
}
