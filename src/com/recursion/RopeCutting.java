package com.recursion;

import java.util.Scanner;

//Solution Of Rope Cutting Problem Using Recursion
public class RopeCutting {

	public static int maxPieces(int n, int a, int b, int c) {
		if (n == 0) {
			return 0;
		} else if (n < 0) {
			return -1;
		}

		int temp1 = maxPieces(n - a, a, b, c);
		int temp2 = maxPieces(n - b, a, b, c);
		int temp3 = maxPieces(n - c, a, b, c);

		int pieces = Math.max(temp3, Math.max(temp1, temp2));

		if (pieces == -1) {
			return -1;
		}
		return pieces + 1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(maxPieces(15, 5, 8, 7));
		scan.close();
	}

}

/*
 * Problem: Given a rope of length n, you need to find the maximum number of
 * pieces you can make such that the length of every peiece is in set {a,b,c}
 * for the given three values a,b,c
 */
