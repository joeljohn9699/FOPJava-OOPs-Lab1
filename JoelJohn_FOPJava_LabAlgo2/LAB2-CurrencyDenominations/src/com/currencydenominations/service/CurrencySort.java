package com.currencydenominations.service;

public class CurrencySort {

	public void sort(int[] currency) {
		// TODO Auto-generated method stub

		for (int i = 0; i < currency.length; i++) {
			for (int j = 0; j < currency.length - 1; j++) {
				if (currency[j] < currency[j + 1]) {
					int temp = currency[j + 1];
					currency[j + 1] = currency[j];
					currency[j] = temp;
				}
			}
		}

	}

}
