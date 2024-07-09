package com.digits;

import java.util.Scanner;

//Program To Print All The Divisors Of A Given Number 
public class All_Divisors {

	// O(n)
//	private static void printAllDivisors(int n) {
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//
//			}
//		}
//
//	}

	// O(Root(n))
	/*
	 * Divisors can be made into pairs. first divisor in the pair of divisors will
	 * always appear before sq. root(n). second divisor can be obtained from the
	 * first divisor by using b=n/a
	 */

//	private static void printAllDivisors(int n) {
//		for (int i = 1; i * i <= n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//				if (i != n / i) {			// to avoid printing duplicate divisors.(Conside 25's divisor will be 1 5 5 25 without this condition
//					System.out.println(n / i);
//				}
//			}
//		}
//
//	}

	// O(root n)
	// print all the divisors in ascending order
	// The program essentially exploits the fact that->
	// if i is a divisor of n, then n / i is also a divisor of n.
	private static void printAllDivisors(int n) {
		int i = 0;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		for (; i >= 1; i--) {
			if (n % i == 0 && i != n / i) {
				System.out.println(n / i);
			}
		}

	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt();
		printAllDivisors(n);
		obj.close();
	}

}
