package com.codility.binarysearch;

public class Test {
	public static void main(String[] args) {
		// 4
		//System.out.println(solution(new int[] { 5, 3, -2, 3, 8, 6 }));
		//5
		System.out.println(solution(new int[] { 3, 4, 5 -2, 3, 8, 6 }));
		
		//-5, -5, -5, -42, 6, 12 - 4
		System.out.println(solution(new int[] {-5, -5, -5, -42, 4, 6, 12}));
		//5, -2, 3, 8, 6 - 4
		System.out.println(solution(new int[] {5, -2, -2, 3, 8, 6}));
	}
	
	public static int solution(int[] T) {
		// write your code in Java SE 8
		int maxValue = T[0];
		int minVal = T[0];
		int position = 0;
		for (int i = 1; i < T.length; i++) {
			if (T[i] <= minVal) {
				minVal = T[i];
				position = i;
			} else {
				if (T[i] > maxValue) {
					if(T[position] > maxValue) 
						position = i;
					maxValue = T[i];
				}
					
			}
		}
		return position;
	}

	public static int solution1(int[] T) {
		// write your code in Java SE 8
		int maxValue = T[0];
		int minVal = T[0];
		int position = 0;
		for (int i = 1; i < T.length; i++) {
			if (T[i] <= minVal) {
				minVal = T[i];
				if(T[i] < maxValue)
					position = i;
			} else {
				if (T[i] > maxValue) {
					maxValue = T[i];
					position = i;
				}
			}
		}
		return position;
	}
}
