package itc;

import java.util.Scanner;

public class DescendingOrder {
	// Swaps a[i] with a[j]
	public static void swap(int[] numbers, int i, int j) {
		if (i != j) {
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}

	public static void selectionSortDescendTrace(int[] numbers, int numElements) {
		for (int i = 0; i < numElements - 1; i++) {
			// find index of smallest element
			int smallest = i;
			for (int j = i + 1; j < numElements; j++) {
				if (numbers[j] < numbers[smallest]) {
					smallest = j;
				}
			}
			swap(numbers, i, smallest); // swap smallest to i0
			for (int j = 1; j < numElements; j++) {
				System.out.print(numbers[j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		int numElements = 0; // size of numbers array
		int[] numbers = new int[10];
		// Read in a list of up to 10 positive integers; stop when -1 is read.
		System.out.println("Enter up to 10 positive integers. -1 to exit");

		int input = 0;
		while (input != -1) {
			numbers[i] = input;
			i++;
			input = scnr.nextInt();
			numElements++;
		}

		// call selectionSortDescendTrace() method.
		selectionSortDescendTrace(numbers, numElements);
	}
}
