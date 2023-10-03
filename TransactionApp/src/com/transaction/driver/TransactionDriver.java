package com.transaction.driver;

import java.util.Scanner;

import com.transaction.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int transactionSize = sc.nextInt();

		int transactionValues[] = new int[transactionSize];

		System.out.println("Enter the value of the array");

		for (int i = 0; i < transactionSize; i++) {
			transactionValues[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOftargets = sc.nextInt();
		
		TransactionService transactionService = new TransactionService();
		transactionService.validateTarget(transactionValues, noOftargets);
		
		sc.close();
	}

}
