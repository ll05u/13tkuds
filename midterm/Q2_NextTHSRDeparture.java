// 檔名：Q2_NextTHSRDeparture.java
import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] times = new String[n];

        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextLine();
        }

        String query = scanner.nextLine();

        /*
         * Time Complexity: O(n)
         * 說明：
         * 1. 線性掃描時刻表尋找第一個大於等於查詢時間的班次。
         * 2. 最壞情況需檢查所有 n 個時間。
         * 3. 因此時間複雜度為 O(n)。
         */

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (times[i].compareTo(query) >= 0) {
                System.out.println(times[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No train");
        }

        scanner.close();
    }
}
