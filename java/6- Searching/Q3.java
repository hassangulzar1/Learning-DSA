public class Q3 {
    public static void main(String[] args) {

        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';

        int s = 0;
        int e = letters.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target < letters[mid]) {
                s = mid + 1;
            } else if (target > letters[mid]) {
                e = mid - 1;
            }

        }
        System.out.println(s % letters.length);
        // return s % letters.length;

    }
}
