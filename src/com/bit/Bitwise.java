package com.bit;

public class Bitwise {

	public static void main(String[] args) {

		System.out.println(5 | 9);
		System.out.println(5 & 9);
		System.out.println(5 ^ 9);
		System.out.println(5 << 1);
		System.out.println(5 << 2);
		System.out.println(5 >> 1);
		System.out.println(5 >> 2);
		System.out.println(-5 >> 1);
		System.out.println(5 >>> 1);
		System.out.println(-5 >>> 1);
		System.out.println(~2);
	}
}

/*
 * a=5 b=9
 * 
 * a= 00000101 b= 00001001
 * 
 * for XOR(^) both bits are same it will 0 otherwise 1
 * 
 * for Left Shift(<<) Multiply c with 2 the no specified right side for right
 * shift(>>) divide c with 2 the no specified right side
 *
 * (>>>) => unsigned right shift or logical right shift 0 is used as filler.
 * sign of no is not preserved
 *
 *
 * (>>) => arithmetic RSO or Signed RSO. MSB is used as filler. Sign of no is
 * preserved
 * 
 * ~n = -(n+1) => ~2= -(2+1)= -3
 *
 *
 *
 *
 */
