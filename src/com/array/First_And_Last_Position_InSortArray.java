package com.array;

import java.util.Arrays;

/*Problem : Given an array of integrs nums sorted in ascending order, find the starting and ending position of a given target value. If target is not found in the arrays, return [-1, -1]. you must write an algorithm with O(log n) runtime complexity.*/

//First And Last Position Of An Element In A Sorted Array
public class First_And_Last_Position_InSortArray {

	public static String searchRange(int[] nums, int target) {

		int l = 0, h = nums.length - 1, mid = 0;

		int[] res = { -1, -1 };

		while (l <= h) {
			mid = (l + h) / 2;
			if (target == nums[mid]) {
				res[0] = mid;
				h = mid - 1;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}

		l = 0;
		h = nums.length - 1;
		mid = 0;

		while (l <= h) {
			mid = (l + h) / 2;
			if (target == nums[mid]) {
				res[1] = mid;
				l = mid + 1;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return Arrays.toString(res);
	}

	public static void main(String[] args) {

//		int[] nums = { 5, 7, 7, 8, 8, 10 };
//		int target = 8;

//		int[] nums = { 5, 7, 7, 8, 8, 10 };
//		int target = 6;

		int[] nums = {};
		int target = 0;

		System.out.println(searchRange(nums, target));
	}

}
