public class SimpleBinaryTree {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("樹的結構:");
        printTree(root, 0); 
    }

    public static void printTree(TreeNode node, int depth) {
        if (node == null) return;

        for (int i = 0; i < depth; i++) {
            System.out.print("   "); 
        }

        System.out.println(node.data); 

        printTree(node.left, depth + 1);
        printTree(node.right, depth + 1);
    }
}
