<<<<<<< HEAD
import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 1 || n > 131) {
            System.out.println("Invalid");
            return;
        }

        List<String> stops = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stops.add(scanner.next());
        }

        String start = scanner.next();
        String end = scanner.next();

        int startIndex = stops.indexOf(start);
        int endIndex = stops.indexOf(end);

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            int stopCount = Math.abs(endIndex - startIndex) + 1;
            System.out.println(stopCount);
        }

        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：stops.indexOf(start) 與 stops.indexOf(end) 各需 O(n) 時間，
 *       其餘加減法與輸出為 O(1)，總體為 O(n)。
 */
=======
import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 1 || n > 131) {
            System.out.println("Invalid");
            return;
        }

        List<String> stops = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stops.add(scanner.next());
        }

        String start = scanner.next();
        String end = scanner.next();

        int startIndex = stops.indexOf(start);
        int endIndex = stops.indexOf(end);

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            int stopCount = Math.abs(endIndex - startIndex) + 1;
            System.out.println(stopCount);
        }

        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：stops.indexOf(start) 與 stops.indexOf(end) 各需 O(n) 時間，
 *       其餘加減法與輸出為 O(1)，總體為 O(n)。
 */
>>>>>>> 4b8310729255ca13cab39407ae76907936954de4
