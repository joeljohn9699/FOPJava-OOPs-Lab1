package com.currencydenominations.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.currencydenominations.service.CurrencyCalculator;
import com.currencydenominations.service.CurrencySort;

public class CurrencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		CurrencySort cs = new CurrencySort();
		CurrencyCalculator cc = new CurrencyCalculator();

		System.out.println("Enter the numbmer of denominations: ");
		int denominations = in.nextInt();
		int[] currency = new int[denominations];

		System.out.println("Enter the Currency Denominations: ");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = in.nextInt();
		}

		cs.sort(currency);
		System.out.println("The denominations are : " + Arrays.toString(currency));

		System.out.println("Enter the rounded net amount you want to pay: ");
		int amount = in.nextInt();

		cc.denominationsCalculator(currency, amount);

		in.close();
	}

}
