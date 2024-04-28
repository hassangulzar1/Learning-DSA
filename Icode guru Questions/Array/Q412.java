import java.util.ArrayList;
import java.util.List;

public class Q412 {

    public static void main(String[] args) {
        int n = 4;
        
        List<String> myList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String s = "";
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            if (divBy3) {
                s += "Fizz";
            }
            if (divBy5) {
                s += "Buzz";
            }
            if (!divBy5 && !divBy3) {
                s += Integer.toString(i);
            }

            myList.add(s);
        }

        System.out.println(myList);


        
    }
}