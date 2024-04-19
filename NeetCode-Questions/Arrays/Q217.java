import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Q217 {
    public static void main(String[] args) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int[] nums = { 1, 2, 3, 1 };
        //
        // for (int i = 0; i < nums.length; i++) {
        // if (map.containsKey(nums[i])) {
        // return true;
        // } else {
        // map.put(nums[i], 1);
        // }
        // }
        // return false;
        int[] nums = { 1, 2, 3, 1 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;

            } else {
                set.add(nums[i]);
            }
        }

        return false;

    }
}
