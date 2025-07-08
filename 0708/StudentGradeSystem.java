public class StudentGradeSystem {

    // 取得等級
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    // 顯示完整報告
    public static void printReport(int[] scores) {
        int n = scores.length;
        char[] grades = new char[n];
        int[] gradeCount = new int[4]; // A, B, C, D
        int sum = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;

        // 分數處理
        for (int i = 0; i < n; i++) {
            int score = scores[i];
            grades[i] = getGrade(score);
            sum += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            // 等級計數
            switch (grades[i]) {
                case 'A': gradeCount[0]++; break;
                case 'B': gradeCount[1]++; break;
                case 'C': gradeCount[2]++; break;
                case 'D': gradeCount[3]++; break;
            }
        }

        double avg = (double) sum / n;

        // 高於平均的人數
        int aboveAvgCount = 0;
        for (int score : scores) {
            if (score > avg) aboveAvgCount++;
        }
        double aboveAvgPercent = 100.0 * aboveAvgCount / n;

        // ==== 輸出 ====
        System.out.println("===== 學生成績報告 =====");
        System.out.println("總人數: " + n);
        System.out.printf("平均分數: %.2f\n", avg);
        System.out.println("最高分: " + max + " (學生 #" + maxIndex + ")");
        System.out.println("最低分: " + min + " (學生 #" + minIndex + ")");
        System.out.printf("高於平均分數比例: %.2f%%\n", aboveAvgPercent);
        System.out.println();
        System.out.println("各等級人數：");
        System.out.println("A: " + gradeCount[0]);
        System.out.println("B: " + gradeCount[1]);
        System.out.println("C: " + gradeCount[2]);
        System.out.println("D: " + gradeCount[3]);
        System.out.println();
        System.out.println("------ 學生詳細列表 ------");
        System.out.printf("%-10s %-10s %-10s\n", "學生編號", "分數", "等級");
        System.out.println("--------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10c\n", i, scores[i], grades[i]);
        }
    }

    // 主程式
    public static void main(String[] args) {
        int[] studentScores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        printReport(studentScores);
    }
}
