package com.recursion;

//Program To Print First N Natural Numbers Using Recursions
public class PrintNo {

	static void printNo(int n) {
		if (n == 0) {
			return;
		}
		printNo(n - 1); // printing forward
		System.out.println(n);
		// printNo(n - 1); // printing reverse
	}

	public static void main(String[] args) {

		printNo(5);

	}

}
