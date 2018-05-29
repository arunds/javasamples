package com.mytest.design.singleton;

import java.util.Iterator;
import java.util.LinkedList;

public class SingletonObjectDemo {

	public static void main(String args[]) throws CloneNotSupportedException {
		//		SingletonClass obj = new SingletonClass();
                //Compilation error not allowed
		//SingletonClass obj = SingletonClass.getSingletonObject();
		//SingletonClass clonedObject = (SingletonClass) obj.clone();
		// Your Business Logic
		//System.out.println("Singleton object obtained");
		
		LinkedList ll = new LinkedList();
		ll.add(3);
		ll.add(2);		
		ll.add(1);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(6);
		
		//ll.

		Iterator iter2 = ll.iterator();
		while(iter2.hasNext()){
			System.out.println(iter2.next());
		}
	}
}