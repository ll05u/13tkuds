import java.util.*;

public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] power = new int[7];

        for (int i = 0; i < 7; i++) {
            power[i] = Integer.parseInt(input[i]);
        }

        int left = 0, right = 6;
        while (left < right) {
            int temp = power[left];
            power[left] = power[right];
            power[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(power[i]);
            if (i < 6) System.out.print(" ");
        }

        scanner.close();
    }
}
