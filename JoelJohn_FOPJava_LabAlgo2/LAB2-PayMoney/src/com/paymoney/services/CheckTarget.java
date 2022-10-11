package com.paymoney.services;

public class CheckTarget {

	public void checktarget(int[] transactions, int targetAmount) {
		// TODO Auto-generated method stub
		int sum = 0;
		int flag = 0;

		for (int i = 0; i < transactions.length; i++) {
			sum = sum + transactions[i];

			// System.out.println("The sum of transactions is: " +sum);

			if (sum >= targetAmount) {
				System.out.println("Target achieved after " + ++i + " transactions.");
				flag = 1;
				break;
			}

		}

		System.out.println();

		if (flag == 0) {
			System.out.println("Target not achieved.");
		}
	}

}
