package com.array;

//Find Ceil & Floor Of An Number In A Sorted Array

/*	ceil - if the value is present in array then itself is ceil if not present then nxt max value is ceil
	floor - if the value is present in array then itself is floor if not present then previous min value is floor */

public class Find_Ceil_and_Floor_of_Array {

	public static int findCeil(int[] a, int key) {

		int low = 0;
		int high = a.length - 1;
		int mid = 0;

		while (low <= high) {

			mid = (low + high) / 2;

			if (key == a[mid]) {
				return a[mid];
			} else if (key < a[mid]) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}

		// to avoid ArrayIndexOutOfBoundException validate low index
		if (low < a.length) {
			return a[low];
		} else {
			return -1;
		}

	}

	public static int findFloor(int[] a, int key) {

		int low = 0;
		int high = a.length - 1;
		int mid = 0;

		while (low <= high) {

			mid = (low + high) / 2;

			if (key == a[mid]) {
				return a[mid];
			} else if (key < a[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		// to avoid ArrayIndexOutOfBoundException validate high index

		if (high >= 0) {
			return a[high];
		} else {
			return -1;
		}

	}

	public static void main(String[] args) {

		int[] a = { 19, 23, 56, 61, 72, 88, 92 };

//		int key = 68;

//		int key = 72;

//		System.out.println(findCeil(a, key));
//		System.out.println(findFloor(a, key));

		System.out.println(findCeil(a, 98));
		System.out.println(findFloor(a, 18));
	}

}
