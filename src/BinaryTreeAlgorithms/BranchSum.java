package BinaryTreeAlgorithms;

import java.util.*;

public class BranchSum
{
	public static void main(String[] args) {

		BranchSum.BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.left.left = new BinaryTree(4);
		root.left.left.left = new BinaryTree(8);
		root.left.left.right = new BinaryTree(9);
		root.left.right = new BinaryTree(5);
		root.left.right.left = new BinaryTree(10);
		root.right = new BinaryTree(3);
		root.right.left = new BinaryTree(6);
		root.right.right = new BinaryTree(7);


		List<Integer> b = branchSums(root);
		System.out.println("b = " + b);
	}

	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
		}
	}

	public static List<Integer> branchSums(BinaryTree root) {
		// Write your code here.
		System.out.println("root = " + root.value);
		ArrayList<Integer> branchSum = new ArrayList<>();
		branchSums(root, branchSum,0);
		return branchSum;
	}

	public static void branchSums(BinaryTree root, ArrayList<Integer> sum,int carryforward)
	{
		if(root==null)
			return;

		System.out.println("root = " + root.value);
		System.out.println("carryforward = " + carryforward);

		carryforward += root.value;

		if(root.right == null && root.left == null)
		{
			System.out.println("reached leaf adding to list = " + root.value);
			sum.add(carryforward);
		}

		branchSums(root.left,sum,carryforward);
		branchSums(root.right,sum,carryforward);

	}


}
