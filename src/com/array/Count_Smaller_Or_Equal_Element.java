package com.array;

//Count Of Smaller Or Equal Elements In An Array 
public class Count_Smaller_Or_Equal_Element {

	static int countSmallAndEqualElements(int[] a, int key) {

		int low = 0;
		int high = a.length - 1;
		int mid = 0;

		while (low <= high) {

			mid = (low + high) / 2;

			if (key == a[mid]) {
				// Checking for duplicates
				while (mid + 1 < a.length && a[mid + 1] == key) {
					mid++;
				}
				break;

			} else if (key < a[mid]) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}

		if (a[mid] > key) {
			// if ele not present
			return mid;
		} else {
			// if ele present with or without duplicate
			return mid + 1;
		}

	}

	public static void main(String[] args) {

//		int ar[] = { 2, 6, 12, 18, 21, 26, 33, 42 };
//		int ar[] = { 2, 6, 12, 18, 21, 26, 26, 26 };
//		int key = 26;

		int ar[] = { 2, 6, 12, 24, 26, 26, 28, 30 };
		int key = 25;

		System.out.println(countSmallAndEqualElements(ar, key));

	}

}
