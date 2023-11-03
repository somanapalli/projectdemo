package com.techm.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try {

			Scanner s = new Scanner(System.in);

			System.out.println("enter first no:");

			int fno = s.nextInt();

			System.out.println("enter second no:");
			int sno = s.nextInt();

			int division = fno / sno;

			System.out.println("divison is: " + division);
		} 
		catch (Exception e) {
			if(e instanceof ArithmeticException) {
				System.out.println("don't enter zero as denominator");
			}
			else if(e instanceof InputMismatchException)
			{
				System.out.println("please pass only numerics");
			}
		}

		finally {
			System.out.println("finally block executed always");
		}
	}

}
