package com.blz.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		num = sc.nextInt();
		sc.close();
		temp = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = 1 + temp;

			}
		}
		if (temp > 0) {
			System.out.println("It is not prime number");
		} else {
			System.out.println("It is prime number");
		}

	}

}
