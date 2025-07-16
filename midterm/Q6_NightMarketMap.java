<<<<<<< HEAD
import java.util.*;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());

        char[][] map = new char[10][10];

        for (int i = 0; i < 10; i++) {
            Arrays.fill(map[i], '#');
        }

        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int r = Integer.parseInt(parts[0]);
            int c = Integer.parseInt(parts[1]);

            if (r >= 0 && r < 10 && c >= 0 && c < 10) {
                map[r][c] = '*';
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
=======
import java.util.*;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());

        char[][] map = new char[10][10];

        for (int i = 0; i < 10; i++) {
            Arrays.fill(map[i], '#');
        }

        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int r = Integer.parseInt(parts[0]);
            int c = Integer.parseInt(parts[1]);

            if (r >= 0 && r < 10 && c >= 0 && c < 10) {
                map[r][c] = '*';
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
>>>>>>> ff3c244dbced069b38832db4b04a2a828e482e25
