import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static int diameter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> vals = new ArrayList<>();
        while (scanner.hasNextInt()) {
            vals.add(scanner.nextInt());
        }
        TreeNode root = buildTree(vals);
        diameter = 0;
        height(root);
        System.out.println(diameter);
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

    static int height(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
