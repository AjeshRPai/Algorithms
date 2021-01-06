package BinaryTreeAlgorithms;

import java.util.*;

// Traverse a tree(Visit tree nodes)
// Unlike linear structures like array,queue and list
// Trees can be visited in multiple order
// Most used ways are
// Inorder - Left node, Root node and then right node
// Preorder - Root node, Left node and then Right node
// Post order - Left node, Right node and then Root node

// Question
// Implement the three Traversals described

public class BinaryTreeTraversal
{
	public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
		if(tree==null)
			return array;

		if(tree.left!=null)
			inOrderTraverse(tree.left, array);

		array.add(tree.value);

		if(tree.right!=null)
			inOrderTraverse(tree.right, array);

		return array;
	}

	public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
		if(tree==null)
			return array;

		array.add(tree.value);

		if(tree.left!=null)
			preOrderTraverse(tree.left, array);

		if(tree.right!=null)
			preOrderTraverse(tree.right, array);

		return array;
	}

	public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
		// Write your code here.
		if(tree==null)
			return array;

		if(tree.left!=null)
			postOrderTraverse(tree.left, array);

		if(tree.right!=null)
			postOrderTraverse(tree.right, array);

		array.add(tree.value);

		return array;
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args)
	{

		BinaryTreeTraversal.BST root = new BinaryTreeTraversal.BST(10);
		root.left = new BST(5);
		root.left.left = new BST(2);
		root.left.left.left = new BST(1);
		root.left.right = new BST(5);
		root.right = new BST(15);
		root.right.left = new BST(13);
		root.right.left.right = new BST(14);
		root.right.right = new BST(22);

		List<Integer> inOrderTraverse = inOrderTraverse(root, new ArrayList<>());
		System.out.println("inOrderTraverse = " + inOrderTraverse);

		List<Integer> preOrderTraverse = preOrderTraverse(root, new ArrayList<>());
		System.out.println("preOrderTraverse = " + preOrderTraverse);

		List<Integer> postOrderTraverse = postOrderTraverse(root, new ArrayList<>());
		System.out.println("postOrderTraverse = " + postOrderTraverse);

	}

}
