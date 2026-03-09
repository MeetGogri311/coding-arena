package dsa.tree;

public class Main {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeBuilder treeBuilder = new PreorderAndInorderTreeBuilder();
        TreeNode root = treeBuilder.buildTree(preorder, inorder);

        if (root == null) {
            System.out.println("buildTree returned null. Implement the method in PreorderAndInorderTreeBuilder.");
            return;
        }

        System.out.print("Inorder traversal from built tree:");
        root.inorderTraversal();
    }
}
