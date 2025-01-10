/*This example shows a value returning method that returns the maximum of two values
input into the method's parameters as arguments.  The findMax method takes two double
parameters and returns the larger one as a double to the calling method.  In this case
the calling method is main.*/

import java.util.Scanner;

public class ValueReturningMethod2
{
	//main method
	public static void main(String[]args)
	{
	   //variable declarations
		double x;
		double y;
		double max;
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Please enter the first number:");
		x = keyboard.nextDouble();
		System.out.println("Please enter the second number:");
		y = keyboard.nextDouble();
	
		max = findMax(x,y);
		
		System.out.println("The max is " + max);
	}
	
	//findMax Method
	public static double findMax(double a, double b)
	{
	  //The return statements are in if/else statements, because what value to return
	  //depends on which is larger
	  if(a >= b)
	  {
	     return a;
	  }
	  
	  //otherwise b is bigger
	  else
	  {
	     return b;
	  }	   
	}
}