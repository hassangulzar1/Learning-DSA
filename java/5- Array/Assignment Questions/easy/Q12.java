import java.util.ArrayList;

public class Q12 {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int gaining = 0;
        ArrayList<Integer> list = new ArrayList<>(gain.length);

        for (int i = 0; i < gain.length; i++) {
            gaining += gain[i];
            list.add(gaining);
        }
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (maxi < list.get(i)) {
                maxi = list.get(i);
            }
        }
        System.out.println(maxi);

    }
}
