package com.digits;

import java.util.Scanner;

//Program To Check If A Number Is Prime Or Not In Java
public class PrimeNoOrNot {

	// O(n)
	// for loop: Every non prime(Composit NO) no has least factor is 2 & from 2
	// onwards it goes
	// Last factor of every non prime no is at number/2 or before
	static boolean isPrime(int n) {
		if (n == 1 || n == 0) {
			return false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false; // non prime
				}
			}
		}
		return true; // prime
	}

	// O(Sq.root(n))
	// Every non prime(Composit NO) no has least factor is 2 & from 2 onwards it goes
	// First factor will always lie at maximum at root(n) or before that.
	static boolean isPrimeTillRootN(int n) {
		if (n == 1 || n == 0) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	// O(Sq.root (n))
	static boolean checkPrime(int a) {
		if (a == 1) {
			return false;
		}
		if (a == 2 || a == 3) {
			return true;
		}
		if (a % 2 == 0 || a % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= a; i = i + 6) {
			if (a % i == 0 || a % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no  : ");
		int a = scanner.nextInt();
//		System.out.println(isPrime(a));
//		System.out.println("Till root n : " + isPrimeTillRootN(a));
	    	System.out.println(checkPrime(a));
		scanner.close();
	}

}
/*
 * A composite number is a natural number or a positive integer which has more
 * than two factors. For example, 15 has factors 1, 3, 5 and 15, hence it is a
 * composite number.
 */
