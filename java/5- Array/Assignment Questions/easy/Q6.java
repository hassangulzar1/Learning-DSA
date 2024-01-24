import java.util.ArrayList;
import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] candies = { 4, 2, 1, 1, 2 };
        int extraCandies = 1;
        int highestVal = 0;

        ArrayList<Boolean> ans = new ArrayList<>(candies.length);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > highestVal) {
                highestVal = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= highestVal) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        System.out.println(ans);
    }
}
