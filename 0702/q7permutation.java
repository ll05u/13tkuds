// q7permutation.java
import java.util.*;

public class q7permutation {
    static int ops = 0;

    public static void permute(List<Integer> arr, int l, int r) {
        if (l == r) {
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
            ops++;
        } else {
            for (int i = l; i <= r; i++) {
                Collections.swap(arr, l, i);
                permute(arr, l + 1, r);
                Collections.swap(arr, l, i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) arr.add(i);
        permute(arr, 0, n - 1);
        System.out.println(ops);
    }
}
