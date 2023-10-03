package com.minNoteCount.driver;

import java.util.Scanner;

import com.minNoteCount.service.CalculateNotesCount;
import com.minNoteCount.service.MergeSortImplementation;

public class NoteCountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortImplementation mergeSort = new MergeSortImplementation();
		CalculateNotesCount calculateNotesCount = new CalculateNotesCount();
		
		System.out.println("Enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] notes = new int[size];
		
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();

		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		mergeSort.sort(notes, 0, notes.length - 1);
		calculateNotesCount.notesCountImplementation(notes, amount);
		sc.close();
	}

}
