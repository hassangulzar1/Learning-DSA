import java.util.Arrays;
import java.util.Scanner;

public class MultiDimesnion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int[][] arr2D = {
        // { 1, 2, 3 },
        // { 4, 5 },
        // { 6, 7, 8, 9 }
        // };

        int[][] arr = new int[3][3];
        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // output
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        //
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }

        // for (int[] a : arr) {
        // System.out.println(Arrays.toString(a));
        // }
    }
}
