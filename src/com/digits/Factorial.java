package com.digits;

import java.util.Scanner;

public class Factorial {
	// 20!=2432902008176640000
	private static long findfact(int n) { // 5
		// 0!=1 and 1!=1
		long result = 1;
		for (int i = 1; i <= n; i++) { // 1<=5,2<=5,3<=5,4<=5,5<=5,6<=5
			result = result * i; // 1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = obj.nextInt();
		System.out.println("Factorial of given no is : " + findfact(n));
		obj.close();
	}

}
