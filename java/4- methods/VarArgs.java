import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 6);
        multiple(1, 2, "sdf", "dsf");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {

    }
}