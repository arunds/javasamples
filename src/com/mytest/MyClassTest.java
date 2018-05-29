package com.mytest;

public class MyClassTest {
	static {
		System.out.println("Static Init!");
	}
	public static void main(String[] args) {
		System.out.println("##Main##");
		StringBuffer sb1 = new StringBuffer("Amit"); 
		   StringBuffer sb2= new StringBuffer("Amit");
		   String s1 = "Amit"; 
		   String s2 = "Amit"; 
		   String s3 = new String("abcd"); 
		   String s4 = new String("abcd");
		   String ss1 = "Amit"; 
		   
		   long l1 = 1;
		   long l2 = 1;
		   
		   System.out.println(l1 == l2);

	}
}
