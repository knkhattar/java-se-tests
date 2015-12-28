package com.kkcom.javase.collections;

/*
 * Bring the minimum at the start.
 * 
 * Iterate through all elements, as you find the minimum, store the index in iMin(i.e. iteration's minimum), at the end of the iteration swap iMin with iStart(i.e. iteration's start)  
 * 
 * Comparison : When you compare it with the simple basic sort. The difference is that swap doesn't happen for each comparison. Rather minimum is remembered. And swap places the element at its final position.
 * 
 * 
 * 
 * 
 * 
 * */
public class SelectionSort {
	  private long[] a;

	  private int nElems;

	  public SelectionSort(int max) {
	    a = new long[max];
	    nElems = 0;
	  }

	  public void insert(long value) {
	    a[nElems] = value;
	    nElems++;
	  }

	  public void display() {
	    for (int j = 0; j < nElems; j++)
	      System.out.print(a[j] + " ");
	    System.out.println("");
	  }

	  public void selectionSort() {
	    int out, in, min;

	    // As we keep finding the minimum , it comes at the start of the array, hence
	    //we should keep decreasing the scope of the inner loop by doing out++
	    
	    for (out = 0; out < nElems - 1; out++) // outer loop
	    {
	      min = out; // minimum
	      for (in = out + 1; in < nElems; in++) {
	        // inner loop
	       
	    	  if (a[in] < a[min]) // if min greater,
	          min = in; // a new min
	      }
	      swap(out, min); // swap them
	    }
	  }

	  private void swap(int one, int two) {
	    long temp = a[one];
	    a[one] = a[two];
	    a[two] = temp;
	  }

	  public static void main(String[] args) {
	    int maxSize = 100;
	    SelectionSort arr; // reference to array
	    arr = new SelectionSort(maxSize); // create the array

	    arr.insert(17); // insert 10 items
	    arr.insert(29);
	    arr.insert(34);
	    arr.insert(45);
	    arr.insert(52);
	    arr.insert(68);
	    arr.insert(71);
	    arr.insert(80);
	    arr.insert(96);
	    arr.insert(33);

	    arr.display();

	    arr.selectionSort();

	    arr.display();
	  }

	}