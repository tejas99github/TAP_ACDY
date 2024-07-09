package com.recursion;

public class LuckyNo {

	public static boolean isLuckyNo(int n, int counter) {
		if (n < counter) {
			return true;
		}

		if (n % counter == 0) {
			return false;
		}
		return isLuckyNo(n - (n / counter), counter + 1);
	}

	public static void main(String[] args) {

		System.out.println(isLuckyNo(13, 2));

	}

}
