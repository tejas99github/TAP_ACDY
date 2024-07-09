package com.recursion;

import java.util.Scanner;

//Solution Of Josephus Problem Using Recursion 
public class Josephus {

	static int josePhus(int n, int k) {
		if (n == 1) {
			return 0;
		}
		return (josePhus(n - 1, k) + k) % n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No of Person: ");
		int n = scan.nextInt();
		System.out.println("Enter Killing Factor: ");
		int k = scan.nextInt();
		System.out.println("The right position is : " + josePhus(n, k));
		scan.close();
	}

}
