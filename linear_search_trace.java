import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {

        // 固定的整數陣列（可自行更改）
        int[] s = {1, 3, 5, 7, 9};

        // 建立 Scanner 物件以讀取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入要搜尋的目標值
        System.out.print("請輸入要搜尋的數字：");
        int target = scanner.nextInt();

        // 記錄是否找到
        boolean found = false;

        // 線性搜尋：逐一比對陣列元素
        for (int i = 0; i < s.length; i++) {
            // 印出比對過程
            System.out.printf("比對中：%d vs %d%n", target, s[i]);

            // 若找到目標值，設為 true 並跳出迴圈
            if (s[i] == target) {
                found = true;
                break;
            }
        }

        // 印出結果
        if (found) {
            System.out.println("結果：找到");
        } else {
            System.out.println("結果：沒找到");
        }

        scanner.close(); // 關閉 Scanner
    }
}
