import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q49 {
    public static void main(String[] args) {
        String[] strs = { "a" };

        // ! Good Solution
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedArray = new String(arr);

            if (!map.containsKey(sortedArray)) {
                map.put(sortedArray, new ArrayList<>());
            }
            map.get(sortedArray).add(strs[i]);

        }

        // return new ArrayList<>(map.values());
    }
}
