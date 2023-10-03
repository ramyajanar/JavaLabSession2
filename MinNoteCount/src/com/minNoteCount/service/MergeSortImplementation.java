package com.minNoteCount.service;

public class MergeSortImplementation {
	
	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			// Merge the sub-arrays
			merge(notes, left, mid, right);
		}
	}
	
	private void merge(int arr[], int left, int mid, int right) {
		
		int size1 = mid - left + 1;
		int size2 = right - mid;

		// Create temporary arrays
		int leftArray[] = new int[size1];
		int rightArray[] = new int[size2];

		
		for (int i = 0; i < size1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < size2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < size1 && j < size2) {
		
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < size2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
