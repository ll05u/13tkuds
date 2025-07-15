import java.util.*;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double[] bills = new double[n];
        double total = 0;

        /*
         * Time Complexity: O(n)
         * 說明：
         * 1. 針對 n 筆用電量，分別計算費用。
         * 2. 每筆計算費用時間固定為 O(1)。
         * 3. 整體時間複雜度為 O(n)。
         */

        // 費率階梯上限(kWh)
        int[] limits = {120, 330, 500, 700, 1000};
        // 對應單價
        double[] prices = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46};

        for (int i = 0; i < n; i++) {
            int kWh = Integer.parseInt(scanner.nextLine());
            bills[i] = calculateBill(kWh, limits, prices);
            total += bills[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Bill: $%.2f\n", bills[i]);
        }
        System.out.printf("Total: $%.2f\n", total);
        System.out.printf("Average: $%d\n", Math.round(total / n));

        scanner.close();
    }

    private static double calculateBill(int kWh, int[] limits, double[] prices) {
        double cost = 0;
        int prevLimit = 0;

        for (int i = 0; i < limits.length; i++) {
            if (kWh > limits[i]) {
                cost += (limits[i] - prevLimit) * prices[i];
                prevLimit = limits[i];
            } else {
                cost += (kWh - prevLimit) * prices[i];
                return cost;
            }
        }
    
        cost += (kWh - prevLimit) * prices[prices.length - 1];
        return cost;
    }
}
