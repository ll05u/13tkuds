import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入圓的半徑: ");
        double num = scanner.nextDouble();

        double area = num * num * Math.PI;

        System.out.println("圓的面積為: " + area);

        scanner.close();
    }
}
