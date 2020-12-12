package BinaryTreeAlgorithms;

// Question
// Find closest value in the Bst
public class ClosestValue {

    public static void main(String[] args) {

        BST root = new ClosestValue.BST(10);
        root.left = new ClosestValue.BST(5);
        root.left.left = new ClosestValue.BST(2);
        root.left.left.left = new ClosestValue.BST(1);
        root.left.right = new ClosestValue.BST(5);
        root.right = new ClosestValue.BST(15);
        root.right.left = new ClosestValue.BST(13);
        root.right.left.right = new ClosestValue.BST(14);
        root.right.right = new ClosestValue.BST(22);

        int closestValueInBst = findClosestValueInBst(root, 12);
        System.out.println("closestValueInBst = " + closestValueInBst);
    }

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closestValue) {
        if (tree == null) {
            return closestValue;
        }
        int difference = Math.abs(target - tree.value);
        int closestDifference = Math.abs(target - closestValue);

        if(difference<closestDifference)
            closestValue = tree.value;

        if (tree.value < target && tree.right!=null) {
            closestValue = findClosestValueInBst(tree.right, target,closestValue);
        } else if(tree.value > target && tree.left!=null) {
            closestValue = findClosestValueInBst(tree.left, target,closestValue);
        }

        return closestValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
