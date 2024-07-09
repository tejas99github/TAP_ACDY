package com.recursion;

import java.util.ArrayList;
import java.util.Scanner;

//Subsequence Of A Given String In Java Using Recursion
public class Subsequence {

	static ArrayList<String> al = new ArrayList<String>();

	static void generateSubsequence(String s, String ans) {
		if (s.length() == 0) {
			// System.out.println(ans);
			al.add(ans);
			return;
		}

		// pick
		generateSubsequence(s.substring(1), ans + s.charAt(0));
		// not pick
		generateSubsequence(s.substring(1), ans);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Strng : ");
		String s = obj.next();
		generateSubsequence(s, "");
		System.out.println(al);
		obj.close();
	}

}
/*
 * Subsequence of a given sequence is a sequence that can be derived from the
 * given sequence by deleting some or no elements without changing the order of
 * the remaining elements
 */