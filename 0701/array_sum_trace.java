
public class array_sum_trace {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            int before = total;
            int addend = arr[i];

            total += addend;

            System.out.printf("加總過程：total = %d + %d = %d%n", before, addend, total);
        }

        System.out.printf("總和為：%d%n", total);
    }
}
