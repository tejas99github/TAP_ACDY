package com.digits;

import java.util.Scanner;

public class Nth_Fibonacci_Series {

	public static void generateFibonacci(int n) {
		int prev = 0;
		int current = 1;
		System.out.println("Nth_Fibonacci_No Series:");

		for (int i = 0; i < n; i++) { // 0<5, 1<5, 2<5, 3<5, 4<5, 5<5
			System.out.print(prev + " "); // 0, 1, 1, 2, 3
			int next = prev + current; // 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8
			prev = current; // 1, 1, 2, 3, 5
			current = next; // 1, 2, 3, 5, 8
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = obj.nextInt();
		generateFibonacci(n);
		obj.close();
	}

}
