package com.minNoteCount.service;

public class CalculateNotesCount {
	
	public void notesCountImplementation(int[] notes,int amount) {
		int[] countArr = new int[notes.length];
		try {
			for( int i=0; i < notes.length; i++)  {
				// Finding the no of notes required and updating the values in new array
				if( amount >= notes[i]) {
					countArr[i] = amount / notes[i];
					amount = amount - countArr[i] * notes[i];
					if(amount == 0) 
						 break;
					}
				}
				if ( amount > 0 ) {
					System.out.println("Exact amount cannot be given with the highest denomination");
				}
				else {
					System.out.println("Your payment approach in order to give min no of notes will be");
					// Looping both the arrays and printing in the required format
					for (int i = 0; i < notes.length; i++) {
						if(countArr[i] != 0) {
							System.out.println(notes[i] + ":" + countArr[i]);
						}
					}
				}
			}
		catch(ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}
}
