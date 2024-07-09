package com.recursion;

import java.util.Scanner;

//Find The Sum of Digits Of A Number Using Recursion 
public class SumOfDigit {

	static int sumOfDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return sumOfDigits(n / 10) + (n % 10);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Digit : ");
		int n = obj.nextInt();
		System.out.println(sumOfDigits(n));
		obj.close();
	}

}

/* SumOfDigits(n)=sumOfDigits(n/10)+(n%10) */