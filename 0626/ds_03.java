import java.util.Scanner;

public class ds_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入您的姓名: ");
        String name = scanner.nextLine();

        System.out.print("請輸入您的年齡: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("請輸入您居住的城市: ");
        String city = scanner.nextLine();

        System.out.println("\n=== 使用者資訊 ===");
        System.out.println("姓名: " + name);
        System.out.println("年齡: " + age);
        System.out.println("城市: " + city);

        scanner.close();
    }
}
