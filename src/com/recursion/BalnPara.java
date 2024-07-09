package com.recursion;

import java.util.Scanner;

//Generate All Balanced Parentheses Using Recursion
public class BalnPara {

	static void balPara(char[] ar, int n, int i, int o, int c) {
		if (i == ar.length) {
			System.out.println(ar);
		}
		if (o < n) {
			ar[i] = '(';
			balPara(ar, n, i + 1, o + 1, c);
		}

		if (c < o) {
			ar[i] = ')';
			balPara(ar, n, i + 1, o, c + 1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No : ");
		int n = scan.nextInt();
		char[] ar = new char[n * 2];
		balPara(ar, n, 0, 0, 0);
		scan.close();
	}

}
