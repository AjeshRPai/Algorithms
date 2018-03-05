package BinaryTreeAlgorithms;

import BinaryTreeAlgorithms.BinaryTree.*;

public class BSTCheck {
    
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(6);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        
        System.out.println("The tree is bst = "+isBst(tree.root));
    }
    
    private static boolean isBst(TreeNode root) {
        return isBstUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    private static boolean isBstUtil(TreeNode node, int minValue, int maxValue) {
        if(node==null)return true;
        
        if(node.key<minValue || node.key>maxValue)
            return false;
        
        return (isBstUtil(node.left,minValue,node.key-1)&&
                isBstUtil(node.right,node.key+1,maxValue));
    }
    
    
}
