public class Q19 {
    public static void main(String[] args) {
        int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };

        int[] years = new int[2051];

        for (int[] i : logs) {
            years[i[0]] += 1;
            years[i[1]] -= 1;
        }

        int maxNum = years[1950];
        int maxYear = 1950;

        for (int i = 1951; i < years.length; i++) {
            years[i] += years[i - 1];

            if (years[i] > maxNum) {
                maxNum = years[i];
                maxYear = i;
            }
        }

        System.out.println(maxYear);
    }
}
