package com.practice.trees;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(40).insert(25).insert(78).insert(10).insert(3).insert(17)
				.insert(32).insert(30).insert(38).insert(78).insert(50)
				.insert(93);
		System.out.println("Inorder traversal");
		bst.printInOrder();

		System.out.println("Preorder Traversal");
		bst.printPreOrder();

		System.out.println("Postorder Traversal");
		bst.printPostOrder();

		System.out.println("The minimum value in the BST: " + bst.findMinimum());
		System.out.println("The maximum value in the BST: " + bst.findMaximum());

	}
}