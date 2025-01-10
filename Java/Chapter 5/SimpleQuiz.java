/*This program uses two VOID methods that take no input*/

import javax.swing.*;

public class SimpleQuiz
{
	public static void main(String[] args)
	{
		//declare variables
		String inputStr;
		int answer;
		
		//get user input
		inputStr = JOptionPane.showInputDialog("What is  5 x 4?");
		answer = Integer.parseInt(inputStr);
		
		//display message depending upon whether or not the answer was correct
		if(answer == 20)
		{
			displayCorrectMessage();
		}
		
		else
		{
			displayIncorrectMessage();
		}
	
	}
	
	//method to display the correct message if the answer is correct
	public static void displayCorrectMessage()
	{
		System.out.println("That answer is correct.");
	}
	
	//method to display the correct message if the answer is incorrect
	public static void displayIncorrectMessage()
	{
		System.out.println("That answer is not correct.");
	}

}