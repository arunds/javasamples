package com.linkedlist;
/**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of linked list we need to find length first
 * but since we can only traverse linked list one time, we will use two pointers
 * one which we will increment on each iteration while other which will be
 * incremented every second iteration. so when first pointer will point to the
 * end of linked list, second will be pointing to the middle element of linked list
 * @author
 */
public class LinkedListTest {
  
  
    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
      LinkedList linkedList = new LinkedList();
      Node head = linkedList.getHead();
      linkedList.add( new Node("1"));
      linkedList.add( new Node("2"));
      linkedList.add( new Node("3"));
      linkedList.add( new Node("4"));
    
      //finding middle element of LinkedList in single pass
      Node current = head;
      int length = 0;
      Node middle = head;
    
      while(current.getNext() != null){
          length++;
          if(length%2 ==0){
              middle = middle.getNext();
              System.out.println(" Middle "+middle.data);
          }
          current = current.getNext();
          System.out.println(" Single "+current.data);
      }
    
      if(length%2 == 1){
          middle = middle.getNext();
      }

      //System.out.println("length of LinkedList: " + length);
      //System.out.println("middle element of LinkedList : " + middle);
      
    } 
  
}

