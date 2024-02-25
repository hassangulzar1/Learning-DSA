import java.util.ArrayList;
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        ArrayList<Integer> list = new ArrayList<>(nums.length);

        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        System.out.println(list);

    }
}
