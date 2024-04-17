import java.util.Arrays;
import java.util.Collections;

public class Q6 {
    public static void main(String[] args) {

        int[] g = { 1, 2, 3 }, s = { 1, 1 };
        Arrays.sort(g);
        Arrays.sort(s);
        int total = 0;

        for (int i = 0, j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j]) {
                total++;
                i++;

            }
        }
        System.out.println(total);
    }
}
