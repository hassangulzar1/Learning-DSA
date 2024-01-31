import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;

        int[][] ans = new int[rows * cols][2];

        int forward = 0;
        int down = 0;

        int loop = 8;
        int replace = 0;
        while (loop > 0) {
            // !forwarding
            if (rStart < rows && cStart < cols) {
                int j = 0;
                System.out.println("forward");
                for (int i = 0; i <= forward + 1; i++) {
                    ans[replace][0] = rStart;
                    ans[replace++][1] = cStart++;
                    j++;
                    loop--;
                }
                forward = j;
                cStart--;
                rStart++;
            }

            // !downwarding
            if (rStart < rows && cStart < cols) {
                System.out.println("down");
                int j = 0;
                for (int i = 0; i <= down; i++) {
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
                for (int i = 0; i <= forward; i++) {
                    ans[replace][0] = rStart;
                    ans[replace++][1] = --cStart;
                    loop--;
                }
                cStart++;
                rStart--;
            }
            // ! upwarding
            if (rStart < rows && cStart < cols) {
                System.out.println("up");
                for (int i = 0; i < down; i++) {
                    ans[replace][0] = --rStart;
                    ans[replace++][1] = cStart;
                    loop--;
                }
                rStart++;
                cStart++;

            }

        }

        System.out.println(Arrays.toString(ans[5]));
    }
}
