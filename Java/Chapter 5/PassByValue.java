/*This program shows that when a method has a primitive data type for its parameter variable
all arguments passed to that parameter variable are passed to it by value.  This means a copy
of the argument is placed in the parameter variable.  Since it's only a copy whatever happens
inside the method cannot change the argument that is outside the method*/
public class PassByValue
{
	public static void main(String[] args)
	{
		int number = 99;  //number starts with a value of 99
		
		System.out.println("The value of the number variable " + 
		                   " in main \nBEFORE the changeMe method call is is " + number + "\n");
		
		//call the changeMe method passing number as an argument
		changeMe(number);
		
		//display the number again and note it didn't change even though
		//changeme changes it's value - due to pass by value (only a copy of 
		//the variable number was passed to changeMe)
		System.out.println("The value of the number variable " + 
		                   " in main \nAFTER the changeMe method call is is " + number + "\n");
		
	}
	
	public static void changeMe(int myValue)
	{
		myValue = 0;
		
		System.out.println("The value of myValue inside the changeMe method is " + myValue + "\n");
	
	}
}