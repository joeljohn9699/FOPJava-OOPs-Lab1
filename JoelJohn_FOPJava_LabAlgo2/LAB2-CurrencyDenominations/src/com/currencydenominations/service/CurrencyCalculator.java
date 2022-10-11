package com.currencydenominations.service;

public class CurrencyCalculator {

	public void denominationsCalculator(int[] currency, int amount) {
		// TODO Auto-generated method stub

		int[] noteqty = new int[currency.length];
		int noOfNotes = 0;

		for (int i = 0; i < currency.length; i++) {
			noteqty[i] = amount / currency[i];
			noOfNotes = noOfNotes + noteqty[i];
			amount = amount % currency[i];
		}

		System.out.println("You have to pay: ");
		for (int i = 0; i < currency.length; i++) {
			if (noteqty[i] != 0) {
				System.out.println(currency[i] + " : " + noteqty[i]);
			}
		}

		System.out.println("You have to pay a minimum of " + noOfNotes + " notes.");
	}

}
