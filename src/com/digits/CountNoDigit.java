package com.digits;

import java.util.Scanner;

public class CountNoDigit {

	static int countDigit(int n) {
		int count = 0;
		while (n != 0) { // 1234, 123, 12, 1, 0
			count++; // 1,2,3,4
			n = n / 10; // 1234/10=123, 123/10=12, 12/10=1, 1/10=0

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = obj.nextInt();
		System.out.println("Total count of digit in number is : " + countDigit(n));
		obj.close();
	}

}
