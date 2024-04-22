import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q49 {
    public static void main(String[] args) {
        String[] strs = { "a" };

        // ! Brute Force solution
        // List<List<String>> ans = new ArrayList<>();
        // Map<String, Integer> map = new HashMap<>();
        //
        // for (int i = 0; i < strs.length; i++) {
        // char[] arr = strs[i].toCharArray();
        // Arrays.sort(arr);
        //
        // System.out.println();
        // if (map.containsKey(new String(arr))) {
        // ans.get(map.get(new String(arr))).add(strs[i]);
        //
        // } else {
        // ans.add(new ArrayList<>());
        // map.put(new String(arr), map.size());
        // ans.get(map.get(new String(arr))).add(strs[i]);
        // }
        // }
        //
        // System.out.println(ans);
    }
}
