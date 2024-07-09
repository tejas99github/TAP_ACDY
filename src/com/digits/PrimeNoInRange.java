package com.digits;

import java.util.Scanner;

//Finding Prime Numbers - Sieve Of Eratosthenes Program In Java 
public class PrimeNoInRange {

	// check the prime or not
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

	// print the prime
	static void printPrimes(int a) {
		for (int i = 2; i <= a; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
			}
		}
	}

	// Sieve Of Eratosthenes algorithm
	static void sievePrintPrimes(int a) {
		boolean[] prime = new boolean[a + 1];
		// for (int i = 2; i <= a; i++) {
		for (int i = 2; i * i <= a; i++) { // loops iterate till root (a) to restrict the boundry
			if (prime[i] == false) { // unmarked
				// for (int j = i * 2; j <= a; j = j + i) {
				for (int j = i * i; j <= a; j = j + i) { // first unmarked multiple at sq of i
					prime[j] = true; // marked
				}
			}

		}
		for (int i = 2; i <= a; i++) {
			if (prime[i] == false) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no  : ");
		int a = scanner.nextInt();
		// printPrimes(a);
		System.out.println("Sieve Of Eratosthenes algorithm");
		sievePrintPrimes(a);
		scanner.close();
	}

}
