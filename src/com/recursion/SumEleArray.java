package com.recursion;

//Find Sum Of All Elements In An Array Using Recursion
public class SumEleArray {

	static int sum(int[] ar, int i) {

		if (i == ar.length) {

			return 0;

		}

		return sum(ar, i + 1) + ar[i];
	}

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4 };

		System.out.println(sum(ar, 0));

	}

}
