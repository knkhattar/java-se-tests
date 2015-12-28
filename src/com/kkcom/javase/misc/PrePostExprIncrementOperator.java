package com.kkcom.javase.misc;

/*
 * 
 * This class demonstrates the use of pre and post increment operator.
 * 
 * PreIncrementOperator = PreExrpressionExecutionOperator
 * PostIncrementOperator = PostExrpressionExecutionOperator
 * 
 * */
public class PrePostExprIncrementOperator {

	public static void main(String args[]) {
		int num1;
		int num2;
		int num3;

		num1 = 100;
		num2 = ++num1;
		num3 = num2++ + ++num1;
		// The above line means num3 = Old(num2) + new(num1)
		// As soon as the expression is executed num2 value is incremented.

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		// result
		// num1 = 102
		// num2 = 102
		// num3 = 203
	}
}
