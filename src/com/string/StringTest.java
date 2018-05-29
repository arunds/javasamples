package com.string;

public class StringTest {
	
	public static void main(String[] args) {
		String a = new String("abcd");
		String b = new String("abcd");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String a1 = "abcd";
		String b1 = "abcd";
		
		System.out.println(a1==b1);
		System.out.println(a1.equals(b1));
		
		
		Integer i = new Integer(100);
		Integer j = new Integer(100);
		System.out.println(i==j);
		System.out.println(i.equals(i));
		
		
		
		
	}
}
