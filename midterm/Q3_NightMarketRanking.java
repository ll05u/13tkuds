import java.util.*;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(scanner.nextLine());
        }

        /*
         * Time Complexity: O(n^2)
         * 說明：
         * 1. 選擇排序需要兩層迴圈遍歷陣列。
         * 2. 每次尋找最大值並交換位置。
         * 3. 整體比較次數約為 n*(n-1)/2，屬於 O(n^2)。
         */

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            double temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
        }

        int limit = Math.min(5, n);
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f\n", scores[i]);
        }

        scanner.close();
    }
}
