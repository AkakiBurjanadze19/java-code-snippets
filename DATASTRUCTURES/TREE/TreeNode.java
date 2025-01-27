package DATASTRUCTURES.TREE;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // order: left subtree, root, right subtree
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            this.inorderTraversal(node.left);
            System.out.println(node.value + " ");
            this.inorderTraversal(node.right);
        }
    }

    // search for a value in the tree
    public boolean search(TreeNode node, int value) {
        if (node == null) {
            return false;
        }

        if (node.value == value) {
            return true;
        }

        if (value < node.value) {
            this.search(node.left, value);
        } else {
            this.search(node.right, value);
        }

        return false;
    }

    // find the minimum value in the tree
    public int findMinValue(TreeNode node) {
        if (node.left == null) {
            return node.value;
        }
        return this.findMinValue(node.left);
    }

    // find maximum value in the tree
    public int findMaxValue(TreeNode node) {
        if (node.right == null) {
            return node.value;
        }
        return this.findMaxValue(node.right);
    }
}
