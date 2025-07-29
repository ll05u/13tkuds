import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        String[] tokens = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        Pair result = findSecondLargest(arr, 0, n - 1);
        System.out.println("SecondMax: " + result.second);

        scanner.close();
    }

    static class Pair {
        int max;
        int second;

        Pair(int max, int second) {
            this.max = max;
            this.second = second;
        }
    }

    static Pair findSecondLargest(int[] arr, int left, int right) {
        if (left == right) {
            return new Pair(arr[left], Integer.MIN_VALUE);
        }

        int mid = (left + right) / 2;
        Pair leftPair = findSecondLargest(arr, left, mid);
        Pair rightPair = findSecondLargest(arr, mid + 1, right);

        if (leftPair.max > rightPair.max) {
            int newSecond = Math.max(leftPair.second, rightPair.max);
            return new Pair(leftPair.max, newSecond);
        } else {
            int newSecond = Math.max(rightPair.second, leftPair.max);
            return new Pair(rightPair.max, newSecond);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：分治法遞迴將陣列拆半，合併時做常數時間比較，
 *       總共處理 n 個元素，故複雜度為線性 O(n)。
 */
