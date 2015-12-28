package com.kkcom.javase.collections;

/*
This class uses common sorting logic. Simple one. It does not relate to any algorithm.
 
The basic idea is , send the heaviest one at last position by comparing and pushing. For each comparison swap happens.

It requires two loops.

The inner loop - once this ends - the heaviest element reaches at the end.
The outer loop - This helps to reduce the scope of the inner loop.
	Because as inner loop completes we are sure that heaviest element is at the end. Then for the next loop the array size pointer needs to be reduced by one for this reason.

 * */
public class SortingTest {

	public static void main(String[] args) {
		int[] arrayOfInts = { 4, 3, 2, 1 };
		for (int i = arrayOfInts.length; --i >= 0;) {
			for (int j = 0; j < i; j++) {
				if (arrayOfInts[j] > arrayOfInts[j + 1]) {
					printVariableState(i, j, arrayOfInts);
					int temp = arrayOfInts[j];
					arrayOfInts[j] = arrayOfInts[j + 1];
					arrayOfInts[j + 1] = temp;

				}
			}
		}

	}

	/*
	 * PRINT THE STATE OF THE VARIABLES BEFORE SWAP 
	 */

	public static void printVariableState(int i, int j, int[] arrayOfInts) {

		System.out.println("i: " + i);
		System.out.println("j: " + j);

		for (int k = 0; k < arrayOfInts.length; k++) {
			System.out.print(arrayOfInts[k] + " ");
		}
		System.out.println();

	}

}
