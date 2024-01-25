public class Q15 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },

        };

        int s = 0;
        int e = mat.length - 1;
        int sum = 0;
        while (s <= e) {
            if (s == e) {
                sum += mat[mat.length / 2][mat.length / 2];
            } else {
                sum += mat[s][s] + mat[s][e];
                sum += mat[e][s] + mat[e][e];
            }

            s++;
            e--;
        }

        System.out.println(sum);

    }
}