public class sum1to100 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

       
        System.out.println("1+2+3+4+5+.........+99+100: " + sum);
    }
}
