import java.util.*;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] station = new String[n];
        int[][] price = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            station[i] = parts[0];
            price[i][0] = Integer.parseInt(parts[1]);
            price[i][1] = Integer.parseInt(parts[2]);
        }

        System.out.printf("%-10s|%-9s|%-8s\n", "Station", "Standard", "Business");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s|%-9d|%-8d\n", station[i], price[i][0], price[i][1]);
        }

        scanner.close();
    }
}
