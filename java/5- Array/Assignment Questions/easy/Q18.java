import java.util.ArrayList;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        List<Integer> list = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {

            list.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }

        while (k > 0) {
            list.add(0, k % 10);
            k /= 10;
        }

        System.out.println(list);
    }
}
