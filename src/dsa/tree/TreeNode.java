package dsa.tree;

public class TreeNode {
    TreeNode left, right;
    int val;

    TreeNode(int val) {
        this.val = val;
    }

    public void inorderTraversal() {
        if (left != null) {
            left.inorderTraversal();
        }
        System.out.printf(" %d", val);
        if (right != null) {
            right.inorderTraversal();
        }
    }
}
