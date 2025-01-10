import java.util.Scanner;

public class ShowSum
{
  //main method
  public static void main(String[]args)
  {
      //variable declarations
		double z = 0;
		double x;
		double y;
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Please enter the first number to add.");
		x = keyboard.nextDouble();
		System.out.println("Please enter the second number to add.");
		y = keyboard.nextDouble();
		System.out.println("Please enter the third number to add.");
		z = keyboard.nextDouble();
		displaySum(x,y,z);
	}
	
	//display sum method - takes three double parameters
	//The value of x is copied into the parameter variable a, the value of y is copied
	//into the parameter variable b, and the value of z is copied into the parameter
	//variable c
	public static void displaySum(double a, double b, double c)
	{
	     //Notice sum is a local variable remember that means its scope
		  //is inside the method it is declared in - it can only be seen in the display sumMethod
		  double sum;
		  sum = a + b + c;
		  System.out.println("The sum of " + a + " , " + b + " and " + c + " is " + sum); 
	 }
}
