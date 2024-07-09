package com.algo;

import java.util.Scanner;

//Bubble Sorting in Java Program with Code
public class BubbleSort {

	static void bubbleSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - i - 1; j++) {
				// chage > to < for descending order printing
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		bubbleSort(ar);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		scan.close();
	}

}

/*
 * Bubble sort works on the repeatedly swapping of adjacent elements until they
 * are not in the intended order. It is called bubble sort because the movement
 * of array elements is just like the movement of air bubbles in the water.
 * Bubbles in water rise up to the surface; similarly, the array elements in
 * bubble sort move to the end in each iteration.Bubble short is majorly used
 * where -complexity does not matter & simple and shortcode is preferred
 */
