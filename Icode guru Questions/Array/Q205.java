import java.util.HashSet;

public class Q205 {
    public static void main(String[] args) {
        String s = "egg", t = "add";

        HashSet<Character> sMap = new HashSet<>();
        HashSet<Character> tMap = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.add(s.charAt(i));
            tMap.add(t.charAt(i));
        }

        System.out.println(s.length());

    }
}
