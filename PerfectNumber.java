package com.blz.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		sc.close();
		boolean b = isPerfectNum(n);
		if (b) {
			System.out.println("It is Perfect Number");
		} else {
			System.out.println("It is not Perfect Number");
		}

	}

	public static boolean isPerfectNum(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (n == sum)
			return true;

		return false;
	}

}
