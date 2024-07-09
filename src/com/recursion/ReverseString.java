package com.recursion;

import java.util.Scanner;

//Program To Reverse A String Using Recursion
public class ReverseString {

	static String reverseString(String s, String r, int i) {
		if (i < 0) {
			return r;
		}
		return reverseString(s, r + s.charAt(i), i - 1);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = obj.next();
		System.out.println(reverseString(s, "", s.length() - 1));
		obj.close();
	}

}
