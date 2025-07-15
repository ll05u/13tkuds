// 檔名：Q1_THSRStopCounter.java
import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] stops = scanner.nextLine().split(" ");

        String start = scanner.next();
        String end = scanner.next();

        /*
         * Time Complexity: O(n)
         * 說明：
         * 1. 線性掃描 n 個站名以找出起訖站位置。
         * 2. 每個元素最多檢查一次。
         * 3. 所以總體時間複雜度為 O(n)。
         */

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIndex = i;
            }
            if (stops[i].equals(end)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(endIndex - startIndex) + 1);
        }

        scanner.close();
    }
}
