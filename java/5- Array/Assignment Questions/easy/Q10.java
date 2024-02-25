public class Q10 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        // ! brute force solution
        int[] allCharCount = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            allCharCount[sentence.charAt(i) - 'a']++;
        }

        for (int i = 0; i < allCharCount.length; i++) {
            if (allCharCount[i] == 0) {
                System.out.println("false");
            }
        }

        // ! optimise solution
        char ch = 'a';

        for (int i = 0; i < 26; i++) {

            if (sentence.contains(String.valueOf(ch))) {
                ch++;
            } else {
                System.out.println("false");
            }
        }
        System.out.println("true");

    }
}
