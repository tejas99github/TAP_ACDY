package com.digits;

import java.util.Scanner;

//Find the Number Of Trailing Zeros In A Factorial 
//20!=2432902008176640000

public class TrailingZeroInFact {

	static int trailingZeros(int n) { // 20
		int result = 0;
		int powOf5 = 5;
		while (n >= powOf5) { // 20>=5, 20>=25
			result = result + (n / powOf5); // 0+20/5=4
			powOf5 = powOf5 * 5; // 25
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		System.out.println("No of trailing zeros : " + trailingZeros(n));
		obj.close();
	}

}

/*
 * In the factorial operation, the number of factors of 5 determines the number
 * of trailing zeros. By incrementing powOF5 in powers of 5 (5, 25, 125, and so
 * on), we are effectively counting each occurrence of factors of 5 in n!
 * 5! = 120
 * 8! = 40320
 * 10! = 3628800
 */
