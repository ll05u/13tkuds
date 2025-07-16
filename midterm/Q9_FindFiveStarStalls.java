<<<<<<< HEAD
import java.util.*;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("None");
        } else {
            int[] idx = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (scores[i] == 5) {
                    idx[j++] = i;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.print(idx[i]);
                if (i < count - 1) System.out.print(" ");
            }
        }

        scanner.close();
    }
}
=======
import java.util.*;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("None");
        } else {
            int[] idx = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (scores[i] == 5) {
                    idx[j++] = i;
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.print(idx[i]);
                if (i < count - 1) System.out.print(" ");
            }
        }

        scanner.close();
    }
}
>>>>>>> ff3c244dbced069b38832db4b04a2a828e482e25
