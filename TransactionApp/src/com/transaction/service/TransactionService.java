package com.transaction.service;

import java.util.Scanner;

public class TransactionService {

	public void validateTarget(int[] transactionValues, int noOftargets) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < noOftargets; i++) {
			boolean isAchieved = false;
			int targerValue;
			System.out.println("Enter the value of target");
			targerValue = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < transactionValues.length; j++) {
				sum += transactionValues[j];

				if (sum >= targerValue) {
					System.out.println("Target achieved after " + (j + 1) + " transcations ");
					isAchieved = true;
					break;
				}
			}
			if (!isAchieved) {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();

	}

}
