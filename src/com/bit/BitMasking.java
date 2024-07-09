package com.bit;
// ON OR OFF
public class BitMasking {

	public static void main(String[] args) {

		int n = 36;
		int i = 3;
		
		int j = 5;

		int onMask = 1 << i;
		System.out.println(n | onMask);

		int offMask = ~(1 << j);
		System.out.println(n & offMask);

	}

}

/*
 * n=36	=> binary = 00100100 
 * 
 * OR|
 *
 * onMask = 00001000
 * 
 * => 00101100 ==> 44
 * 
 * AND(&)
 * 
 * offMask = 11011111
 * 
 * => 00000100 =>4
 * 
 * 
 */
