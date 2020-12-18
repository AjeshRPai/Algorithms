package BinaryTreeAlgorithms;


public class BSTCheck {

	public static void main(String[] args) {

		BST root = new BST(10);
		root.left = new BST(5);
		root.left.left = new BST(2);
		root.left.left.left = new BST(1);
		root.left.right = new BST(5);
		root.right = new BST(15);
		root.right.left = new BST(13);
		root.right.left.right = new BST(14);
		root.right.right = new BST(22);

		boolean b = validateBst(root);
		System.out.println("b = " + b);
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}


    public static boolean validateBst(BST tree) {
	    return isBstUtil(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBstUtil(BST node, int minValue, int maxValue) {
	    System.out.println("node = " + node + ", minValue = " + minValue + ", maxValue = " + maxValue);
        if(node==null)
        	return true;

        if(node.value<minValue || node.value>=maxValue)
            return false;

        return (isBstUtil(node.left,minValue,node.value)&&
                isBstUtil(node.right,node.value,maxValue));
    }

}
