package com.kkcom.javase.collections;

/*
 * 0 2 3 1 
 * 0 2 3 1 
 * 0 2 3 1 
 * 0 1 2 3
 * 
 * Outer loop : Marks the element to be taken out one by one. 
 * Inner loop : compares the marked element with the previous one, unless a suitable position is obtained other elements are shifted.    
 *   
 * Refer gif  
 * 
 * Swap doesn't happen here. Rather shifting of the whole array and insert happens. 
 * 
 * */

public class InsertSort {
	  private long[] number;

	  private int nElems;

	  public InsertSort(int max) {
	    number = new long[max];
	    nElems = 0;
	  }

	  public void insert(long value) {
	    number[nElems] = value;
	    nElems++;
	  }

	  public void display() {
	    for (int j = 0; j < nElems; j++)
	      System.out.print(number[j] + " ");
	    System.out.println("");
	  }

	  /* 0 2 3 1
	   * out =4
	   * temp = "1"
	   * in = 4
	   * 
	   * 
	   */
	  

	  /* 0 2 3 1 
	  *  0 2 3 1 
	  *  0 2 3 1 
	  *  0 1 2 3
	  */
	  public void insertionSort() {
	    int in, out;
	    //     out is dividing line
	    for (out = 1; out < nElems; out++) {
	    	
	      long temp = number[out]; // remove marked item
	      in = out; // start shifts at out
	      while (in > 0 && number[in - 1] >= temp) // until one is smaller,
	    	  
	      {
	        number[in] = number[in - 1]; // shift item to right
	        --in; // go left one position
	      }
	      number[in] = temp; // insert marked item
	      printVariableState(out, in, number);
	    }
	  }
	  
		/*
		 * PRINT THE STATE OF THE VARIABLES BEFORE SWAP 
		 */

		public static void printVariableState(int i, int j, long[] arrayOfInts) {

			System.out.println("out: " + i);
			System.out.println("out[i]: " + arrayOfInts[i]);
			System.out.println("in: " + j);

			for (int k = 0; k < arrayOfInts.length ; k++) {
				System.out.print(arrayOfInts[k] + " ");
			}
			System.out.println();

		}
	  

	  public static void main(String[] args) {
	    int maxSize = 4; // array size
	    InsertSort arr; // reference to array
	    arr = new InsertSort(maxSize); // create the array
	    arr.insert(0);
	    arr.insert(2);
	    arr.insert(3);
	    arr.insert(1);
	    
// GIF has an example - following elements match with that example 	    
//	    arr.insert(6);
//	    arr.insert(5);
//	    arr.insert(3);
//	    arr.insert(1);
//	    arr.insert(8);
//	    arr.insert(7);
//	    arr.insert(2);
//	    arr.insert(4);

	    
	    
	    arr.display();

	    arr.insertionSort();

	    arr.display();
	  }

	}