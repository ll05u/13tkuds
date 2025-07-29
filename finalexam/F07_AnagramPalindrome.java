import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String filtered = input.toLowerCase().replaceAll("[^a-z]", "");
        int[] freq = new int[26];

        for (char c : filtered.toCharArray()) {
            freq[c - 'a']++;
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }

        scanner.close();
    }
}
