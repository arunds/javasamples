package com.practice.linkedlist;

class LinkedList {

	Node head;
	Node tail;

	LinkedList(Node node) {
		this.head = node;
		tail = head;
	}

	public void addNode(Node node) {
		tail.nextPtr = node;
		tail = node;
	}
}
