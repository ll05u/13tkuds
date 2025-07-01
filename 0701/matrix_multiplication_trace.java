public class matrix_multiplication_trace {
    public static void main(String[] args) {
  8
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
          
            for (int j = 0; j < 2; j++) {
                StringBuilder multTrace = new StringBuilder();
                StringBuilder sumTrace = new StringBuilder(); 

                for (int k = 0; k < 2; k++) {
                    int product = a[i][k] * b[k][j];
                    c[i][j] += product;

                    multTrace.append(a[i][k] + "*" + b[k][j]);
                    sumTrace.append(product);

                    if (k < 1) { 
                        multTrace.append(" + ");
                        sumTrace.append(" + ");
                    }
                }

                System.out.printf("計算位置 c[%d][%d]：%s = %s = %d%n",
                        i, j, multTrace.toString(), sumTrace.toString(), c[i][j]);
            }
        }

     
        System.out.println("結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
