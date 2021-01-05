package BinaryTreeAlgorithms;

import java.util.*;

// Question
// Find the sum of depth of nodes
// Depth of one node is the distance between a root and the node
// Direct children has a depth of 1 and child of that node will have a depth of 2

// Assumptions
// Node has an integer value
// Each node can have a left and right node or can be null


public class NodeDepth
{
	public static void main(String[] args) {

		NodeDepth.BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.left.left = new BinaryTree(4);
		root.left.left.left = new BinaryTree(8);
		root.left.left.right = new BinaryTree(9);
		root.left.right = new BinaryTree(5);
		root.right = new BinaryTree(3);
		root.right.left = new BinaryTree(6);
		root.right.right = new BinaryTree(7);

		int depth = nodeDepths(root);
		System.out.println("depth = " + depth);
	}

	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
		}
	}

	public static int nodeDepths(BinaryTree root) {
		return findNodeDepth(root,0);
	}

	public static int findNodeDepth(BinaryTree root ,int level)
	{
		if(root==null)
			return 0;

		int depthSum = level;
		level += 1;

		if(root.left != null)
		{
			depthSum += findNodeDepth(root.left,level);
		}

		if(root.right!=null)
		{
			depthSum += findNodeDepth(root.right,level);
		}

		return depthSum;
	}

}
