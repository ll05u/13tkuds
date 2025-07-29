import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] names = new String[n];
        int[] qtys = new int[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int spaceIndex = line.lastIndexOf(" ");
            names[i] = line.substring(0, spaceIndex);
            qtys[i] = Integer.parseInt(line.substring(spaceIndex + 1));
        }

        for (int i = 1; i < n; i++) {
            String keyName = names[i];
            int keyQty = qtys[i];
            int j = i - 1;

            while (j >= 0 && qtys[j] < keyQty) {
                names[j + 1] = names[j];
                qtys[j + 1] = qtys[j];
                j--;
            }
            names[j + 1] = keyName;
            qtys[j + 1] = keyQty;
        }

        int outputCount = Math.min(10, n);
        for (int i = 0; i < outputCount; i++) {
            System.out.println(names[i] + " " + qtys[i]);
        }

        scanner.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：插入排序在最壞情況（完全反向排序）下需 O(n^2) 次比較與移動，
 *       整體程式主要耗時在排序，因此總體為 O(n^2)。
 */
