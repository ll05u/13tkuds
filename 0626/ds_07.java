public class ds_07 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        System.out.println("3x3 二維陣列內容：");
        for (int i = 0; i < matrix.length; i++) { // 外層：列
            for (int j = 0; j < matrix[i].length; j++) { // 內層：行
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
