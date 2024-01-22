import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // sum();
        // greeting();
        // int ans = sum2();
        // System.out.println(ans);

        // String message = greet();
        // System.out.println(message);

        // int ans = sum(10, 10);
        // System.out.println(ans);

        // String ans = greet("heeloow");
        // System.out.println(ans);

        // ! Premitive value is only passed by value
        // int a = 10;
        // int b = 20;
        // swap(a, b);
        // System.out.println(a + " " + b);

        // in the array

        int[] arr = { 1, 2, 3, 4, 5 };
        change(arr);

        System.out.println(Arrays.toString(arr));

    }

    // ! return the value
    // static int sum2() {
    // Scanner input = new Scanner(System.in);
    //
    // System.out.println("Enter Number 1: ");
    // int num1 = input.nextInt();
    // System.out.println("Enter number 2: ");
    // int num2 = input.nextInt();
    //
    // int sum = num1 + num2;
    // return sum;
    // }

    // ! without returning
    // static void sum() {
    // Scanner input = new Scanner(System.in);
    //
    // System.out.println("Enter Number 1: ");
    // int num1 = input.nextInt();
    // System.out.println("Enter number 2: ");
    // int num2 = input.nextInt();
    //
    // int sum = num1 + num2;
    // System.out.println(sum);
    // }

    // static void greeting() {
    // System.out.println("Hellow world");
    // }

    // ! String function
    // static String greet() {
    // return "hellow world";
    // }

    // !function parameters
    // static int sum(int a, int b) {
    //
    // int sum = a + b;
    // return sum;
    // }

    // static String greet(String a) {
    // return a;
    // }

    // Swaping two number
    // static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}