import java.util.*;

public class F09_BinaryTreeLeftView {
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
        TreeNode root = buildTree(vals);
        List<Integer> leftView = leftView(root);
        System.out.print("LeftView:");
        for (int v : leftView) System.out.print(" " + v);
        System.out.println();
        scanner.close();
    }

    static TreeNode buildTree(List<Integer> vals) {
        if (vals.isEmpty() || vals.get(0) == -1) return null;
        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int idx = 1;
        while (!q.isEmpty() && idx < vals.size()) {
            TreeNode node = q.poll();
            if (idx < vals.size()) {
                int leftVal = vals.get(idx++);
                if (leftVal != -1) {
                    node.left = new TreeNode(leftVal);
                    q.offer(node.left);
                }
            }
            if (idx < vals.size()) {
                int rightVal = vals.get(idx++);
                if (rightVal != -1) {
                    node.right = new TreeNode(rightVal);
                    q.offer(node.right);
                }
            }
        }
        return root;
    }

    static List<Integer> leftView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (i == 0) res.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }
        return res;
    }
}
