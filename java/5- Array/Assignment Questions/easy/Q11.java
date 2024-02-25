import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11 {
    public static void main(String[] args) {
        // String[][] items = {
        // { "phone", "blue", "pixel" },
        // { "computer", "silver", "lenovo" },
        // { "phone", "gold", "iphone" }
        // };
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "gold", "iphone"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "blue", "pixel"));

        String ruleKey = "color";
        String ruleValue = "silver";

        // ! BruteForce Solution
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> temp = items.get(i);

            if ("type".equals(ruleKey)) {
                count += temp.get(0).equals(ruleValue) ? 1 : 0;
            }
            if ("color".equals(ruleKey)) {
                count += temp.get(1).equals(ruleValue) ? 1 : 0;
            }
            if ("name".equals(ruleKey)) {
                count += temp.get(2).equals(ruleValue) ? 1 : 0;
            }
        }
        System.out.println(count);

        // ! Optimise Solution
        // int count = 0;
        // for (int i = 0; i < items.size(); i++) {
        // if ("type".equals(ruleKey) && items.get(i).get(0).equals(ruleValue))
        // count++;
        // if ("color".equals(ruleKey) && items.get(i).get(1).equals(ruleValue))
        // count++;
        // if ("name".equals(ruleKey) && items.get(i).get(2).equals(ruleValue))
        // count++;
        //
        // }
    }
}
