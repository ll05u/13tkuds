import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> vals = new ArrayList<>();
        while (scanner.hasNextInt()) {
            vals.add(scanner.nextInt());
        }
        if (vals.size() < 3) return;
        // 最後兩個是 L 和 R
        int L = vals.get(vals.size() - 2);
        int R = vals.get(vals.size() - 1);
        vals = vals.subList(0, vals.size() - 2);

        TreeNode root = buildBST(vals);
        int sum = rangeSumBST(root, L, R);
        System.out.println(sum);
        scanner.close();
    }

    static TreeNode buildBST(List<Integer> vals) {
        TreeNode root = null;
        for (int v : vals) {
            root = insert(root, v);
        }
        return root;
    }

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        if (root.val < L) return rangeSumBST(root.right, L, R);
        else if (root.val > R) return rangeSumBST(root.left, L, R);
        else
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
