package com.recursion;

import java.util.Scanner;

//Program To Print Nth_Fibonacci_No Series Using Recursion
public class Nth_Fibonacci_No {

	static int fibo(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		// nth term
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		System.out.println(fibo(n));
		scanner.close();

	}

}

/*
 * 1 1 2 3 5 8 13 21...n 5th term = 4th term + 3rd term nth term =
 * (n-1)term+(n-2)th term fibo(n)=fibo(n-1)+fibo(n-1)
 */
