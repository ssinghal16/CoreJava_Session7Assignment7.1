//Write a program to convert an int variable to String using an inbuilt function of String class.

//Package declaration 
package com.acadgild.assignment1;

public class Assignment1 {
	//Main method 
	public static void main(String[] args) {
		   double d = 756.226772;
		   //Double to String  conversion
		   String str = String.valueOf(d);
		   System.out.println("This is Double to String conversion " + str);
		   int i_am_int = 756;

		   //Integer to String conversion
		   String str1 = String.valueOf(i_am_int);
		   System.out.println("This is the conversion from Integer to String " + str1);

	}

}
