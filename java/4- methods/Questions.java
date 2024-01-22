import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        // System.out.println(isPrime(n));
        System.out.println(isArmstrong(153));
    }

    // Print all the three digit armstrong number

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }

        return sum == original;
    }

    // static boolean isPrime(int n) {
    //
    // if (n <= 1) {
    // return false;
    // }
    //
    // int c = 2;
    //
    // while (c * c <= n) {
    // if (n % c == 0) {
    // return false;
    // }
    // c++;
    // }
    //
    // return c * c > n;
    // }
}
