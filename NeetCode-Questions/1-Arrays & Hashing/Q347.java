import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q347 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        Map<Integer, Integer> res = new HashMap<>();
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int i : nums) {
            res.merge(i, 1, Integer::sum);
        }

        for (int i : res.keySet()) {
            int freq = res.get(i);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(i);
        }

        int[] mainAns = new int[k];
        int index = 0;

        for (int i = nums.length; i >= 0; i--) {

            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    mainAns[index++] = n;
                }
                if (index == k) {
                    // return mainAns;
                    break;
                }
            }
        }
        // return mainAns;
        System.out.println(Arrays.toString(mainAns));
    }
}
