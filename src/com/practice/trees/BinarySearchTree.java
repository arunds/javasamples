package com.practice.trees;

public class BinarySearchTree {
	TreeNode root;

	public BinarySearchTree insert(int nodeValue) {
		TreeNode treeNode = new TreeNode(nodeValue);
		if (root == null) {
			root = treeNode;
			return this;
		}
		insertRec(root, treeNode);
		return this;
	}

	private void insertRec(TreeNode latestRoot, TreeNode node) {

		if (latestRoot.value > node.value) {
			if (latestRoot.left == null) {
				latestRoot.left = node;
			} else {
				insertRec(latestRoot.left, node);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = node;
			} else {
				insertRec(latestRoot.right, node);
			}
		}
	}
	
	public int findMinimum() {
		if(root == null)
			return 0;
		TreeNode currentNode = root;
		while(currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}
	
	public int findMaximum() {
		if(root == null)
			return 0;
		TreeNode currentNode = root;
		while(currentNode.right != null) {
			currentNode = currentNode.right;
		}
		return currentNode.value;
	}
	
	public void printInOrder() {
		printInOrderRecursive(root);
	}

	private void printInOrderRecursive(TreeNode currentNode) {
		if(currentNode == null)
			return;
		printInOrderRecursive(currentNode.left);
		System.out.println(currentNode.value);
		printInOrderRecursive(currentNode.right);
	}

	
	public void printPreOrder() {
		printPreOrderRecursive(root);
	}

	private void printPreOrderRecursive(TreeNode currentNode) {
		if(currentNode == null)
			return;
		System.out.println(currentNode.value);
		printInOrderRecursive(currentNode.left);
		printInOrderRecursive(currentNode.right);
	}
	
	public void printPostOrder() {
		printPostOrderRecursive(root);
	}

	private void printPostOrderRecursive(TreeNode currentNode) {
		if(currentNode == null)
			return;
		printInOrderRecursive(currentNode.left);
		printInOrderRecursive(currentNode.right);
		System.out.println(currentNode.value);
	}

}
