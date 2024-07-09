package com.array;

//Search An Element In Bitonic Array

/*Problem : Given a bitonic sequence A of N distinct elements, write a program to find a given element B in the bitonic sequence in O(log N) time*/

/*Note : A Bitonic sequence is a sequence of numbers which is first striclty increasing then after a point striclty decreasing*/

/*Algo: 1.find the point where the array can be split.(BitonicPoint) 
  		2.Check if the element is at the bitonic point.If yes return the bitonic point. 
 		3.Otherwise perform the binary search on left and right side of the bitonic point using binary search */

public class Search_In_Bitonic_Array {

	static int ascendingBinarySearch(int[] a, int key, int range) {
		int low = 0;
		int high = range;
		int mid = 0;

		while (low <= high) {

			mid = (low + high) / 2;

			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	static int descendingBinarySearch(int[] a, int key, int range) {
		int low = range;
		int high = a.length - 1;
		int mid = 0;

		while (low <= high) {

			mid = (low + high) / 2;

			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	static int findBitonicPoint(int[] a) {

		int left = 0;
		int right = a.length - 1;
		int mid = 0;

		while (left <= right) {

			mid = (left + right) / 2;

			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
				return mid;
			} else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return -1;
	}

	static int searchBitonic(int[] a, int key, int bitIdx) {

		if (key == a[bitIdx]) {
			return bitIdx;
		}

		if (key > a[bitIdx]) {
			return -1;
		}

		int res1 = ascendingBinarySearch(a, key, bitIdx - 1);

		if (res1 != -1) {
			return res1;
		}

		int res2 = descendingBinarySearch(a, key, bitIdx + 1);

		if (res2 != -1) {
			return res2;
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] a = { 5, 6, 7, 8, 9, 10, 3, 2, 1 };

//		int b = 8;

		int b = 80;

		int bitIdx = findBitonicPoint(a);

		System.out.println(searchBitonic(a, b, bitIdx));

	}

}
