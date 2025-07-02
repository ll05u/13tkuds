import java.util.Scanner;

public class q1arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入要加總的數字個數 n：");
        int n = scanner.nextInt();

        int sum = 0;
        int ops = 0;

        System.out.println("請依序輸入 " + n + " 個整數：");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
            ops++;
        }

        System.out.println("總和為：" + sum);
        System.out.println("輸入次數為：" + ops);

        scanner.close();
    }
}
