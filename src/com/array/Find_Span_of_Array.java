package com.array;

//Finding Span Of An Array In Java 

//Span(array)=max - min

public class Find_Span_of_Array {

	static int spanOfArray(int[] ar) {

		int max = ar[0];
		int min = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}

			if (ar[i] < min) {
				min = ar[i];
			}
		}

		return max - min;
	}

	public static void main(String[] args) {

		int[] a = { 20, 42, 88, 10, 99, 6 };

		System.out.println("Span of an array is : " + spanOfArray(a));

	}

}
