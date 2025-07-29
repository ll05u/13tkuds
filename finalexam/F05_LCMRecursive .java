import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        long lcm = (long) a * b / gcd;
        System.out.println("LCM: " + lcm);

        scanner.close();
    }

    static int gcd(int a, int b) {
        if (a == b) return a;
        if (a > b) return gcd(a - b, b);
        else return gcd(a, b - a);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：輾轉相減法遞迴，在最壞情況下需約 max(a, b) 次遞迴呼叫，
 *       複雜度比除法法歐幾里得法高，為線性時間。
 */
