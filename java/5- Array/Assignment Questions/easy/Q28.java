public class Q28 {
    public static void main(String[] args) {
        int[] position = { 1, 2, 3 };

        int even = 0;
        int odd = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                even++;

            } else {
                odd++;
            }
        }

        System.out.println(Math.max(even, odd));
    }
}
