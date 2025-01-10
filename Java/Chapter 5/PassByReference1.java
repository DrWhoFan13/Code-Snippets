/*This program illustrates a String being passed to a method in Java.  Since a string variable
contains teh address of teh string object, the address is passed to the method.  The string
is passed by reference rather than passed by value like primitive variables are*/

public class PassByReference1
{
	public static void main(String[]args)
	{
		//create a String object containing "Warren"
		//this name variable references (contains the address of) the String object
		String name = "Warren";
		
		//call the display length method
		displayLength(name);
	}
	
	public static void displayLength(String str)
	{
		int stringLength;  //a variable whose scope is only inside the display length
		                   //method
		stringLength = str.length();  //call the String method length
		System.out.println("The length of the string " + str + " is " + stringLength);
	}
	
}