public class ds_05 {
    public static void main(String[] args) {
        // 建立並初始化一個含 5 個整數的陣列
        int[] numbers = {10, 20, 30, 40, 50};

        // 輸出所有元素
        System.out.println("陣列的內容為：");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("第 " + (i + 1) + " 個元素是: " + numbers[i]);
        }
    }
}
