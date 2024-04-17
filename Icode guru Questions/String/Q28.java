public class Q28 {

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";

        int H = haystack.length();
        int N = needle.length();

        for (int i = 0; i < H - N + 1; i++) {
            if (haystack.substring(i, i + N).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}