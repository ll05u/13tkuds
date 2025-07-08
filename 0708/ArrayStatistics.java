public class ArrayStatistics {
    public static void main(String[] args) {
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0;
        double avg;
        int max = data[0], min = data[0];
        int maxIndex = 0, minIndex = 0;
        int aboveAvgCount = 0;
        int evenCount = 0, oddCount = 0;

        // 先計算總和、最大最小、奇偶
        for (int i = 0; i < data.length; i++) {
            int value = data[i];
            sum += value;

            if (value > max) {
                max = value;
                maxIndex = i;
            }
            if (value < min) {
                min = value;
                minIndex = i;
            }

            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        avg = (double) sum / data.length;

        // 計算大於平均值的數量
        for (int value : data) {
            if (value > avg) {
                aboveAvgCount++;
            }
        }

        // 輸出表格
        System.out.println("+----------------------------+");
        System.out.printf("| %-25s | %5d |\n", "總和 (Sum)", sum);
        System.out.printf("| %-25s | %5.2f |\n", "平均值 (Average)", avg);
        System.out.printf("| %-25s | %5d |\n", "最大值 (Max)", max);
        System.out.printf("| %-25s | %5d |\n", "最大值索引 (Index)", maxIndex);
        System.out.printf("| %-25s | %5d |\n", "最小值 (Min)", min);
        System.out.printf("| %-25s | %5d |\n", "最小值索引 (Index)", minIndex);
        System.out.printf("| %-25s | %5d |\n", "大於平均值的數量", aboveAvgCount);
        System.out.printf("| %-25s | %5d |\n", "偶數數量", evenCount);
        System.out.printf("| %-25s | %5d |\n", "奇數數量", oddCount);
        System.out.println("+----------------------------+");
    }
}
