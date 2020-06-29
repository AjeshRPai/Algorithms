package BinaryTreeAlgorithms;

import TreeAlgorithms.Leaf;

public class HeightOfTree {


    public static void main(String[] args) {

        int height = findTheHeight(getDummyRoot().root);

        System.out.println("height = " + height);

    }

    private static int findTheHeight(BinaryTree.TreeNode node) {
        if(node.key == null)
            return -1;

        if(node.left==null || node.right==null)
            return 0;

        return Math.max(findTheHeight(node.left),findTheHeight(node.right))+1;
    }


    public static BinaryTree getDummyRoot() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTree.TreeNode(4);
        tree.root.left = new BinaryTree.TreeNode(6);
        tree.root.right = new BinaryTree.TreeNode(5);
        tree.root.left.left = new BinaryTree.TreeNode(1);
        tree.root.left.right = new BinaryTree.TreeNode(3);
        tree.root.left.left.left = new BinaryTree.TreeNode(1);
        tree.root.left.left.right = new BinaryTree.TreeNode(3);
        tree.root.left.right.left = new BinaryTree.TreeNode(1);
        tree.root.left.right.right = new BinaryTree.TreeNode(3);
        return tree;
    }
}
