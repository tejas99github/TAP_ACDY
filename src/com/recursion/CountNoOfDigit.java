package com.recursion;

//Count The Number Of Digits In A Number Using Recursion
public class CountNoOfDigit {

	static int countDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return countDigits(n / 10) + 1;
	}

	public static void main(String[] args) {

		System.out.println(countDigits(123456));

	}

}
