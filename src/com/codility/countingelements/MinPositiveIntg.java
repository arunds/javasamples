package com.codility.countingelements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinPositiveIntg {
	public static void main(String[] A) {
		int[] givenA = { 1, 3, 6, 4, 1, 2 };
		MinPositiveIntg a = new MinPositiveIntg();
		System.out.println(a.solution(givenA));
	}

	public int solution(int[] A) {

		Arrays.sort(A);
		List<Integer> list = IntStream.of(A).boxed().sorted().distinct().collect(Collectors.toList());
System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (A[i] > 0 && (A[i+1] == (A[i] + 1))) {
				return A[i];
			}
		}

		return 1;
	}
}
