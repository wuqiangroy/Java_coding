

public class LotteryArray {
    public static void main(String[] args) {
        final int MAX = 10;
        int[][] odds = new int[MAX+1][];
        for (int i = 0; i <= MAX; i++) {
            odds[i] = new int[i+1];
        }

        for (int i = 0; i < odds.length; i++) {
            for (int j = 0; j < odds[i].length; j++) {
                int lotteryOdds = 1;
                for (int n = 1; n <= j; n++) {
                    lotteryOdds = lotteryOdds * (i-n+1) / n;
                }
                odds[i][j] = lotteryOdds;
            }
        }

        for (int[] row: odds) {
            for (int b: row) {
                System.out.printf("%4d", b);
            }
            System.out.println();
        }
    }
}