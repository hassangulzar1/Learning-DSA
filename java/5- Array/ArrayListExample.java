import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner input = new Scanner(System.in);
        // list.add(23);
        // list.add(34);
        // list.add(34);
        // list.add(56);
        // list.add(546);
        // list.add(456);
        // list.add(546);
        // list.add(54);
        // list.add(65);
        // list.add(4567);
        // list.add(7654);
        // list.add(5467);
        //
        // System.out.println(list.contains(5));
        // list.set(0, 99);
        // list.remove(2);
        //
        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);

        int[] arr = { 1, 2, 3, 4 };

    }
}
