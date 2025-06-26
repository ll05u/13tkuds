public class ds_04 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("陣列的內容為：");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("第 " + (i + 1) + " 個元素是: " + numbers[i]);
        }
    }
}
