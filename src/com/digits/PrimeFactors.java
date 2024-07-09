package com.digits;

import java.util.Scanner;

//Program To Find All The Prime Factors Of A Number

/*To find the prime factors of n, you start by dividing it by the smallest prime number, 
 * which is 2, then continue dividing by prime numbers until you cannot divide anymore.*/

public class PrimeFactors {

	// O(n)
//	private static void primeFactors(int n) { //40
//		int i = 2;
//		while (n > 1) {						//40>1, 20>1, 10>1, 5>1,1>1
//			while (n % i == 0) {			//40%2==0, 20%2==0 , 10%2==0, 5%2!=0, 5%3!=0, 5%4!=0,5%5==0
//				System.out.println(i);		//2,2,2,5
//				n = n / i;					//20,10,5,1
//			}
//			i++;							//3,4,5
//		}
//
//	}

	// O(root(n)log n)
	private static void primeFactors(int n) {
		int i = 2;
		while (i * i <= n) { // first factor / divisor of that no will always appear on or before root(n)
			while (n % i == 0) {
				System.out.println(i); // printing composite no
				n = n / i;
			}
			i++;
		}
		if (n > 1) {
			System.out.println(n); // printing prime no
		}

	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		primeFactors(n);
		obj.close();

	}

}
