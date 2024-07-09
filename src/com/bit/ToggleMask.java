package com.bit;

//Toggle and check on or off operation
public class ToggleMask {

	public static void main(String[] args) {
		int n = 36;
		int i = 5;

		int tmask = 1 << i;
		System.out.println(n ^ tmask);

		int cmask = 1 << i;
		if ((n & cmask) == 0) {
			System.out.println("OFF");
		} else {
			System.out.println("ON");
		}
	}

}

/*
 * fOR Toggle case n=36 => binary = 00100100
 * 
 * XOR (^)
 *
 * tmask => 00100000
 *
 * 00000100 =>4
 * 
 * for chek on or off opeariton 
 * n= 00100100 
 * cmask=00100000
 * 
 */