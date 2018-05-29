package com.practice.linkedlist;

public class LinkedListTesting {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(new Node("Head Node Data"));
		myLinkedList.addNode(new Node("Second Node Data"));
		myLinkedList.addNode(new Node("Thired Node Data"));
		myLinkedList.addNode(new Node("Fourth Node Data"));
		//myLinkedList.addNode(new Node("Fifth Node Data"));

		/*Node temp = myLinkedList.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextPtr;
		}*/
		
		//Node middleNode = findMiddleElement(myLinkedList);
		addNodeInPosition(3, new Node("Added in 4th Position"), myLinkedList);
		printData(myLinkedList);
		
		
	}

	public static Node findMiddleElement(LinkedList linkedList) {
		Node tempPointer1 = linkedList.head;
		Node middlePointer = linkedList.head;

		int length = 0;
		while (null != tempPointer1.nextPtr) {
			length++;
			if(length % 2 == 0) {
				middlePointer = middlePointer.nextPtr;
			}
			tempPointer1 = tempPointer1.nextPtr;
		}
		System.out.println(middlePointer.data);
		return middlePointer;
	}
	
	public static void printData(LinkedList linkedList) {
		Node currentNode = linkedList.head;
		System.out.println(currentNode.data);
		while (null != currentNode.nextPtr) {
			currentNode = currentNode.nextPtr;
			System.out.println(currentNode.data);
		}

	}
	
	public static LinkedList addNodeInPosition(int position, Node newNode,
			LinkedList myLinkedList) {
		
		Node currentNode = myLinkedList.head;
		
		for(int i =1; i <= position; i++) {
			if(i == position) {
				Node nextNode = currentNode.nextPtr;
				currentNode.nextPtr = newNode;
				newNode.nextPtr = nextNode;
				return myLinkedList;
			}
			currentNode = currentNode.nextPtr;
		}
		return myLinkedList;
	}
	
	public static void reverseListIteratively(LinkedList linkedList) {
		Node headNode = linkedList.head;
		if(headNode == null || headNode.nextPtr == null) {
			return;
		}
		
		Node secondNode = headNode.nextPtr;
		
		Node thirdNode = secondNode.nextPtr;
		
		
	}
}
