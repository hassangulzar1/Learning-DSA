public class Q10 {
    static int binarySearch(int[] arr, int s, int e) {

        int isPossible = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= -1) {
                isPossible = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return isPossible;
    }

    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };

        int row = grid.length - 1;

        int s = 0;
        int e = grid[0].length - 1;

        int sum = 0;
        while (row >= 0) {

            int index = binarySearch(grid[row], s, e);
            if (index != -1) {
                sum += grid[0].length - index;
                row--;
            } else {
                System.out.println(sum);
            }

        }
        System.out.println(sum);
    }

}
