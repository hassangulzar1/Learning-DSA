public class Q12 {

    public static int particularRow(int[][] mat, int target) {

        int rStart = 0;
        int rEnd = mat.length - 1;

        while (rStart <= rEnd) {

            int mid = rStart + (rEnd - rStart) / 2;

            if (mat[mid][0] > target && mat[mid][mat[0].length - 1] > target) {
                rEnd = mid - 1;
            }

            if (mat[mid][0] < target && mat[mid][mat[0].length - 1] < target) {
                rStart = mid + 1;
            }

            if (mat[mid][0] > target && mat[mid][mat[0].length - 1] < target) {
                rEnd = mid;
            }
            if (mat[mid][0] < target && mat[mid][mat[0].length - 1] > target) {
                rStart = mid;
            }

            if (mat[mid][0] <= target && mat[mid][mat[0].length - 1] >= target) {
                return mid;
            }

        }

        return -1;
    }

    public static int searchInCol(int[] mat, int target) {
        int s = 0;
        int e = mat.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mat[mid] == target) {
                return mid;

            } else if (mat[mid] < target) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1 } };
        int target = 1;

        int index = particularRow(matrix, 1);
        if (index == -1) {
            // return false;
        }

        int find = searchInCol(matrix[index], target);

        if (find == -1) {
            // return false;

        }
        System.out.println(find);
        // return true;
    }
}
