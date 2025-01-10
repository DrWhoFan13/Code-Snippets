/*This example shows a value returning method.  The displaySum method takes three double
parameters adn returns their sum as a double to the calling method.  In this case
the calling method is main.  Main then uses the returned value from the displaySum method
and stores it in the double variable total.  Later total is used to calculate the average of 
the numbers */

import java.util.Scanner;

public class ValueReturningMethods1
{
	//main method
	public static void main(String[]args)
	{
	   //variable declarations
		double z = 0;
		double x;
		double y;
		double total;
		double average;
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Please enter the first number:");
		x = keyboard.nextDouble();
		System.out.println("Please enter the second number:");
		y = keyboard.nextDouble();
		System.out.println("Please enter the third number:");
		z = keyboard.nextDouble();
	
		total = displaySum(x,y,z);
		
		//averarge uses the value returned from the displaySum method and saved in the
		//total variable
		average = total/3;
		
		System.out.println("The average is " + average);
	}
	
	//display sum method - takes three double parameters
	//The value of x is copied into the parameter variable a, the value of y is copied
	//into the parameter variable b, and the value of z is copied into the parameter
	//variable c.  The method returns the sum of the parameters as a double.
	public static double displaySum(double a, double b, double c)
	{
	  //Notice sum is a local variable remember that means its scope
	  //is inside the method it is declared in - it can only be seen in the display sumMethod
	  double sum;
	  sum = a + b + c;
     return sum;	   
	}
}