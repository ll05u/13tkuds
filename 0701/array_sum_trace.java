/*  檔名：array_sum_trace.java
 *
 *  功能：逐一加總整數陣列中的元素，並在每一次加總時
 *        印出「目前總和 + 新值 = 新總和」的過程，
 *        最後再印出整個陣列元素的總和。
 *
 *  額外說明：
 *  1. 直接在程式中宣告固定陣列 int[] arr = {1, 3, 5};
 *  2. 時間複雜度為 O(n) —— 詳細說明見程式下方註解。
 */

public class array_sum_trace {
    public static void main(String[] args) {

        /* ★ 1. 建立要加總的整數陣列（可自行修改） */
        int[] arr = {1, 3, 5};

        /* ★ 2. 初始化累加器 total，從 0 開始 */
        int total = 0;

        /* ★ 3. 逐一走訪陣列元素：for 迴圈的 i 會從 0 依序增加到 arr.length‑1 */
        for (int i = 0; i < arr.length; i++) {
            /* 先把當前 total 與即將加入的 arr[i] 記下來，方便列印 */
            int before = total;
            int addend = arr[i];

            /* 執行相加 */
            total += addend;

            /* 列印此次加總的「追蹤過程」 */
            System.out.printf("加總過程：total = %d + %d = %d%n", before, addend, total);
        }

        /* ★ 4. 迴圈結束後，total 就是所有元素的「總和」 */
        System.out.printf("總和為：%d%n", total);
    }
}
