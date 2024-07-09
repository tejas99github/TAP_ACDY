package com.bit;

import java.util.Scanner;

public class Bit_Manipulation {

	// Convert Decimal to Binary
	// any given n keep dividing it by 2 till the n after dividing becomes 1, the
	// moment it becomes 1 take all the remainders and add them up together
	private static String deciToBinary(int n) {

		String b = "";

		while (n >= 1) {
			int x = n % 2; // All integer data type use base 2 format to converts it into 0's & 1's
			n = n / 2;
			b = x + b; // bits must take in reverse order
			// b = b + x; // So don't take like this;'b' should be at last to concatinate
		}

		return b;
	}

	// Convert Binary to Decimal
	// Identify all bits which is set to 1 take 2 to the power[0 to n] positional
	// value all of them and add
	private static int binaryToDecimal(String b) {

		int result = 0;
		// Every single bit has 2 to the power[0 to n] positional value
		int powOf2 = 1;

		for (int i = b.length() - 1; i >= 0; i--) {

			if (b.charAt(i) == '1') {

				result = result + powOf2;
			}

			powOf2 = powOf2 * 2;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		String b = deciToBinary(n);
		System.out.println(b);
		System.out.println(binaryToDecimal(b));
		obj.close();

	}

}
