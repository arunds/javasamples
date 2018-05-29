package com.mytest.collection;

import java.util.HashSet;
import java.util.Set;

public class MyCollectionTest {
	
	public static void main(String[] args) {
		
		Set mySet = new HashSet();
		mySet.add("1");
		mySet.add("2");
		mySet.add("1");
		mySet.add("3");
		
		for (Object object : mySet) {
			System.out.println(object);
		}
		
		Set<Employee> mySetEmp = new HashSet<Employee>();
		mySetEmp.add(new Employee("1"));
		mySetEmp.add(new Employee("2"));
		mySetEmp.add(new Employee("1"));
		mySetEmp.add(new Employee("4"));
		
		for (Employee employee : mySetEmp) {
			System.out.println(" Emp Name : "+ employee.getEmpName());
		}
	}
}
