package com.recursion;

import java.util.Scanner;

//Program To Check If A String Is Palindrome Using Recursion
public class StringPalindrome {

	static boolean isPalindrome(String s, int i, int j) {
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		if (j <= i) {
			return true;
		}
		return isPalindrome(s, i + 1, j - 1);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = obj.next();
		System.out.println(isPalindrome(s, 0, s.length() - 1));
		obj.close();
	}

}
