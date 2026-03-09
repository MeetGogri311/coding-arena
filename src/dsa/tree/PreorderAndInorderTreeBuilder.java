package dsa.tree;

import java.util.HashMap;
import java.util.Map;

public class PreorderAndInorderTreeBuilder implements TreeBuilder {
    private final Map<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();
    private int preorderIndex;

    private TreeNode constructTree(int[] preorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd || preorder.length == preorderIndex) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderIndex++]);
        Integer i = inorderMap.get(root.val);
        if (i == null) {
            throw new RuntimeException("incorrect traversal data, cannot construct tree");
        }
        root.left = constructTree(preorder, inorderStart, i - 1);
        root.right = constructTree(preorder, i + 1, inorderEnd);
        return root;
    }

    ;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        preorderIndex = 0;
        return constructTree(preorder, 0, inorder.length - 1);
    }
}
