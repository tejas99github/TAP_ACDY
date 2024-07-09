package com.digits;

import java.util.Scanner;

//Program To Find GCD Or HCF Of Two Given Numbers In Java
public class GCD_OR_HCF {

	// brute force approach
	// O(min(a,b))
	static int findHCF(int a, int b) {
		if (a != 0 && b != 0) {
			int min = (a < b) ? a : b;
			for (int i = min; i >= 1; i--) {
				if (a % i == 0 && b % i == 0) {
					return i;
				}
			}
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}
	}

	// Euclid Algorithm approach
	// O(max(a,b))
	static int euclidGCD(int a, int b) {// 15,20
		while (a != b) { // 15!=20, 15!=5, 10!=5, 5!=5
			if (a > b) { // 15>20, 15>5, 10>5
				a = a - b; // 15,10,5
			} else {
				b = b - a; // 5
			}
		}
		return a; // 5
	}

	// Optimized Euclid Algorith by Gabriel Lame
	// O(log(min(a,b))
	/*
	 * It's based on the principle that the GCD of two numbers doesn't change if the
	 * larger number is replaced by its remainder when divided by the smaller
	 * number. The loop continues until one of a or b becomes zero, indicating that
	 * the other one holds the GCD.
	 */
	static int findOptimizedGcd(int a, int b) {// 15,20
		while (a != 0 && b != 0) {
			if (a > b) { // 15>20, 15>5
				a = a % b; // a=0
			} else {
				b = b % a; // b=5
			}
		}
		if (a != 0) { // 0!=0
			return a;
		} else {
			return b; // 5
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First NO : ");
		int a = scanner.nextInt();
		System.out.println("Second NO : ");
		int b = scanner.nextInt();
		System.out.println("GCD by bruteforce appraoch : " + findHCF(a, b));
//		 System.out.println("GCD By Euclid Approarch : " + euclidGCD(a, b));
//		System.out.println("GCD by Optimized Euclid Algorith " + findOptimizedGcd(a, b));

		scanner.close();
	}

}

/*
 * GCD is the greatest common factor of two or more numbers. A factor that is
 * the highest among the numbers. Suppose, 4, 8 and 16 are three numbers. Then
 * the factors of 4, 8 and 16 are: 4 → 1,2,4 8 → 1,2,4,8 16 → 1,2,4,8,16
 * Therefore, we can conclude that 4 is the highest common factor among all
 * three numbers.
 *
 * input 20, 15 - > 5 , 173, 133 ->1
 * 
 * The reason for starting the loop counter i from the minimum of a and b is to
 * optimize the algorithm. Since we are looking for the greatest common divisor
 * (GCD) of a and b, we want to start searching from the smallest potential
 * divisor that is greater than 0.This means we don't need to loop through
 * unnecessary iterations where i would be guaranteed to not be a divisor of
 * both a and b.
 * 
 */
