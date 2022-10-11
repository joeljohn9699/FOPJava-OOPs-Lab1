package com.paymoney.driver;

import java.util.Scanner;

import com.paymoney.services.CheckTarget;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		CheckTarget ct = new CheckTarget();

		System.out.println("Enter the number of transactions: ");
		int size = in.nextInt();
		int[] transactions = new int[size];

		System.out.println("Enter the transactions: ");
		for (int i = 0; i < size; i++) {
			transactions[i] = in.nextInt();
		}

		System.out.println("Enter the number of targets: ");
		int targets = in.nextInt();

		for (int i = 1; i <= targets; i++) {
			System.out.println("Enter value of target " + i + ": ");
			int targetAmount = in.nextInt();
			ct.checktarget(transactions, targetAmount);
		}

		in.close();
	}

}
