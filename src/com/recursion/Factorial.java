package com.recursion;

//Program To Find Factorial Of A Number Using Recursion |
public class Factorial {

	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		int n = 3;
		System.out.println(factorial(n));

	}

}

/*
 * 5! = 5*4*3*2*1 = 5*4! n! = n*(n-1)! 1!=1 0!=1
 */
