package com.linkedlist;

class LinkedList {
	private Node head;
	private Node tail;

	public LinkedList() {
		this.head = new Node("head");
		tail = head;
	}

	public Node getHead() {
		return head;
	}

	public void add(Node node) {
		tail.next = node;
		tail = node;
	}


}
