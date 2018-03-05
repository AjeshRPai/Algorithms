package BinaryTreeAlgorithms;

class BinaryTree{
    
    static class TreeNode{
        int key;
        TreeNode left, right;
        
        TreeNode(int item) {
            key = item;
            left = right = null;
        }
    }
    
    BinaryTree(int key) {
        root = new TreeNode(key);
    }
    
    BinaryTree(){
        root=null;
    }
    
    TreeNode root;
    
    
    
    
}
    

    
