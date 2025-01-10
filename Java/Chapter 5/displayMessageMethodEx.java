/*This program shows how a method named displayMessage can be called inside a for loop
the number of times requested by the user*/

import java.util.Scanner;

public class displayMessageMethodEx
{
  //the main method
  public static void main(String[] args)
  {
    //declare variables
	 int numTimes;
	 Scanner keyboard = new Scanner (System.in);
	 
	 //Prompt user and get input
	 System.out.println("How many times would you like to display the message?");
	 numTimes = keyboard.nextInt();
	 
	 //use a for loop to display the message the number of times the user input
	 for(int counter = 0; counter < numTimes; counter++)
	 {
	    //method call
		 displayMessage();
	 }
  }
  
  //the display message method, the parameter list - between the parenthesis is empty
  //because it takes no arguments (input)
  public static void displayMessage()
  {
    System.out.println("This is my message.");
  }
}