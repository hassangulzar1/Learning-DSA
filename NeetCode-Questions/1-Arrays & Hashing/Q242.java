import java.util.HashSet;

public class Q242 {
    public static void main(String[] args) {
        String s = "a", t = "ab";

        int[] ans = new int[26];

        for (char i : s.toCharArray()) {
            ans[i - 'a']++;

        }
        for (char i : t.toCharArray()) {
            ans[i - 'a']--;

        }

        for (int i : ans) {
            if (i != 0) {
                // return true;

            }
        }
        // return false;
    }
}
