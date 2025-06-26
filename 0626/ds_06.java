import java.util.Random;

public class ds_06 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        // 產生 10 個隨機整數並存入陣列
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // 0 到 99 的隨機數
        }

        // 輸出陣列內容
        System.out.print("陣列內容：");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 找出最大值
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 輸出最大值
        System.out.println("陣列中的最大值是: " + max);
    }
}
