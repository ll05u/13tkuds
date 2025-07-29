import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            times.add(toMinutes(scanner.nextLine()));
        }

        int query = toMinutes(scanner.nextLine());

        int left = 0, right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (times.get(mid) > query) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (result == -1) {
            System.out.println("No bike");
        } else {
            System.out.println(toHHMM(times.get(result)));
        }

        scanner.close();
    }

    static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    static String toHHMM(int totalMinutes) {
        int h = totalMinutes / 60;
        int m = totalMinutes % 60;
        return String.format("%02d:%02d", h, m);
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：時間表已遞增排序，可用二分搜尋找出第一個大於查詢時間的值，
 *       轉換時間與格式化時間皆為 O(1)，總體為 O(log n)。
 */
