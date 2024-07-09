package com.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Print All The Permutations Of A String Using Recursion
public class StringPermutations {

	static List<String> permutationsList = new ArrayList<String>();

	static void permutations(char[] ar, int fi) {

		if (fi == ar.length - 1) {
			
			// System.out.println(ar);
			permutationsList.add(new String(ar)); // method creates a new string representation of the character array &
													// add in list
			return;
		}

		for (int i = fi; i < ar.length; i++) {
			swap(ar, i, fi);
			permutations(ar, fi + 1);
			swap(ar, i, fi);
		}
	}

	static void swap(char[] ar, int i, int fi) {
		char temp = ar[i];
		ar[i] = ar[fi];
		ar[fi] = temp;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = obj.next();
		permutations(s.toCharArray(), 0);
		obj.close();

		System.out.println("Permutatins List : ");
		for (String permutation : permutationsList) {
			System.out.println(permutation);
		}
	}

}
