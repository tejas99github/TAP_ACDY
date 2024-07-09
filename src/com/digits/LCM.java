package com.digits;

import java.util.Scanner;

//Program To Find LCM Of Two Numbers In Java
//input 2,5 ->10, 7,3 ->21
public class LCM {

	// Brute force approach
	// O(a*b-max(a,b))
	/*
	 * The reason for considering max here is that the least common multiple must be
	 * a multiple of the larger number among a and b, but it also needs to be
	 * divisible by the smaller number to be their LCM. 
	 */
	static int findLCM(int a, int b) { // 2,5

		if (a == 0 || b == 0) {
			return 0; // LCM with 0 is always 0
		}
		// int result = Math.max(a, b);
		int max = (a > b) ? a : b; // 5,6,7,8,9,10
		while (true) {
			if (max % a == 0 && max % b == 0) { // 10%2==0 10%5==0
				break;
			}
			max++; // 6,7,8,9,10
		}
		return max;
	}

	// Optimized Euclid Algorith by Gabriel Lame
	static int findOptimizedGcd(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}
	}

	// Using math equation : LCM(a,b)*GCD(a,b)=a*b
	static int findLcmUsingEculid(int a, int b) {
		return (a * b) / findOptimizedGcd(a, b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First NO : ");
		int a = scanner.nextInt();
		System.out.println("Second NO : ");
		int b = scanner.nextInt();
		System.out.println("LCM is : " + findLCM(a, b));
		// System.out.println("LCM using Euclid : " + findLcmUsingEculid(a, b));
		scanner.close();
	}

}
/*
 * the LCM of any two is the value that is evenly divisible by the two given
 * numbers. The full form of LCM is Least Common Multiple. It is also called the
 * Least Common Divisor (LCD). For example, LCM (4, 5) = 20. Here, the LCM 20 is
 * divisible by both 4 and 5 such that 4 and 5 are called the divisors of 20.
 * Now, if we consider the multiples of 16 and 20, we get;
 * 
 * 16 → 16, 32, 48, 64, 80,…
 * 
 * 20 → 20, 40, 60, 80,…,
 * 
 * We can see that the first common multiple for both numbers is 80 The
 * LCM(Least Common Multiple) of 0 and any non-zero number is always 0. This is
 * because 0 is a multiple of every integer, and any number multiplied by 0
 * results in 0. Therefore, when one of the numbers is 0, the LCM is always 0.
 */