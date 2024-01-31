import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;

        int[][] ans = new int[rows * cols][2];

        int forward = 1;
        int down = 0;
        int left = 0;
        int up = 0;

        int loop = 8;
        int replace = 0;
        while (loop > 0) {
            // !forwarding
            if (rStart < rows && cStart < cols) {
                int j = 0;
                System.out.println("forward");
                System.out.println(cStart);
                for (int i = 0; i <= forward; i++) {
                    ans[replace][0] = rStart;
                    ans[replace++][1] = cStart += j;
                    j++;
                    loop--;
                }
                forward = j;
                rStart++;
            }

            // !downwarding
            if (rStart < rows && cStart < cols) {
                System.out.println("down");
                int j = 0;
                for (int i = 0; i < down + 1; i++) {
                    ans[replace][0] = rStart;
                    ans[replace++][1] = cStart;
                    loop--;
                    j++;
                }
                down = j;
            }
            // ! Leftwording
            if (rStart < rows && cStart < cols) {
                System.out.println("left");
                int j = 0;
                for (int i = 0; i < forward; i++) {
                    ans[replace][0] = rStart;
                    ans[replace++][1] = cStart--;
                    loop--;
                    j++;
                }
                down = j;
                rStart--;
            }

            // ! upwarding
            if (rStart < rows && cStart < cols) {
                System.out.println("up");
                int j = 0;
                for (int i = 0; i < down; i++) {
                    ans[replace][0] = rStart -= i;
                    ans[replace++][1] = cStart;
                    loop--;
                    j++;
                }
                up = j;
            }

        }

        System.out.println(Arrays.toString(ans[7]));
    }
}
