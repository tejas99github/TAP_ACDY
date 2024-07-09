package com.array;

public class Second_Smallest_Element {

	static int secondSmallest(int[] a) {

		int min1 = 0, min2 = 0;

		if (a[0] < a[1]) {
			min1 = a[0];
			min2 = a[1];
		} else {
			min1 = a[1];
			min2 = a[0];
		}

		for (int i = 2; i < a.length; i++) {

			if (a[i] < min1) {
				min2 = min1;
				min1 = a[i];

			} else if (a[i] < min2) {
				min2 = a[i];
			}

		}

		return min2;
	}

	public static void main(String[] args) {

		int[] a = { 20, 42, 6, 25, 30, 88 };

		System.out.println("Second smallest element in array is : " + secondSmallest(a));

	}

}
