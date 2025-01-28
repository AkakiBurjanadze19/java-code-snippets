package DATASTRUCTURES.TREE;

public class TreeExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("inorder traversal: ");
        root.inorderTraversal(root);

        System.out.println(root.search(root, 100));

        System.out.println("min value: " + root.findMinValue(root));
        System.out.println("max value: " + root.findMaxValue(root));
    }
}
