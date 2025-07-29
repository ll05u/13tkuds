import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalTax = 0;

        for (int i = 0; i < n; i++) {
            double income = Double.parseDouble(scanner.nextLine());
            double tax = calculateTax(income);
            totalTax += tax;
            System.out.printf("Tax: $%.2f%n", tax);
        }

        double avg = n > 0 ? totalTax / n : 0;
        System.out.printf("Average: $%.2f%n", avg);

        scanner.close();
    }

    static double calculateTax(double income) {
        double tax = 0;
        double remaining = income;

        double[] brackets = {600000, 600000, 900000, 1500000};
        double[] rates = {0.05, 0.12, 0.20, 0.30, 0.40};

        for (int i = 0; i < brackets.length; i++) {
            if (remaining <= 0) break;
            double taxable = Math.min(remaining, brackets[i]);
            tax += taxable * rates[i];
            remaining -= taxable;
        }
        if (remaining > 0) {
            tax += remaining * rates[rates.length - 1];
        }

        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：對每筆收入計算稅額為常數時間 O(1)，
 *       總共處理 n 筆輸入，故整體為 O(n)。
 */
