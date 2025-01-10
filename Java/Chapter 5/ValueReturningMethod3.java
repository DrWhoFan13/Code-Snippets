/*This example shows an example of a value returning method where the type of the value
returned is a boolean.  The method will accept a value and determine if it is even.
The method will return true if the value is even and false if it is not even (it is odd) */

import java.util.Scanner;

public class ValueReturningMethod3
{
   public static void main(String[]args)
	{
	  //declare variables
	  boolean isNumEven;  //to hold the value returned by the method
	  int number;  //to hold the user input
	  Scanner keyboard = new Scanner(System.in);
	  
	  //get input
	  System.out.println("Please enter a number (integers only):");
	  number = keyboard.nextInt();
	  
	  //call the method and store its return value in the isEven variable
	  isNumEven = isEven(number);
	  
	  if(isNumEven == true)
	  {
	    System.out.println("The number " + number + " is even.");
	  }
	  
	  else
	  {
	     System.out.println("The number " + number + " is odd.");
	  }
	}
	
	public static boolean isEven(int value)
	{
	  //an even number always has a remainder of zero when divided by 2
	  if(value%2 == 0)
	  {
	     return true;
	  }
	  
	  //otherwise the number is odd
	  else
	  {
	    return false;
	  }
	}
}