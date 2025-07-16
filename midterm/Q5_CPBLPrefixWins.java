import java.util.*;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] results = scanner.nextLine().split(" ");
        int k = Integer.parseInt(scanner.nextLine());

        /*
         * Time Complexity: O(k)
         * 說明：
         * 1. 只需計算前 k 場的累積勝場數。
         * 2. 累積過程用迴圈跑 k 次。
         * 3. 故時間複雜度為 O(k)。
         */

        int sum = 0;
        StringBuilder sb = new StringBuilder("PrefixSum:");
        for (int i = 0; i < k; i++) {
            sum += Integer.parseInt(results[i]);
            sb.append(" ").append(sum);
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}
