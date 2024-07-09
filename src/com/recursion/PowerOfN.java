package com.recursion;

//Finding Power Of A Number Using Recursion
public class PowerOfN {

	public static long pow(int base, int power) {
		if (power == 0) {
			return 1;
		}

		if (power % 2 == 0) {
			long res = pow(base, power / 2);
			return res * res;
		} else {
			return pow(base, power - 1) * base;
		}

	}

	public static void main(String[] args) {
		System.out.println(pow(5, 8));
	}

}
