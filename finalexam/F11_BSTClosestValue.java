import java.util.*;

public class F11_BSTClosestValue {
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
        if (vals.size() < 2) return;
        int T = vals.get(vals.size() - 1);
        vals = vals.subList(0, vals.size() - 1);

        TreeNode root = null;
        for (int v : vals) {
            root = insert(root, v);
        }

        int closest = findClosest(root, T);
        System.out.println(closest);
        scanner.close();
    }

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    static int findClosest(TreeNode root, int target) {
        int closest = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(closest - target)) {
                closest = root.val;
            } else if (Math.abs(root.val - target) == Math.abs(closest - target)) {
                closest = Math.min(closest, root.val);
            }
            if (target < root.val) root = root.left;
            else if (target > root.val) root = root.right;
            else break;
        }
        return closest;
    }
}
