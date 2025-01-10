/*This program shows that even though a String is passed by reference when it is the argument
to a method (meaning the address of the String is passed), if the String changes inside the
method, the original String passed as an argument to the method still does NOT change*/

public class PassByReference2
{
	public static void main(String[]args)
	{
		//create a String object containing "Shakespeare"
		//this name variable references the object (contains the address of the
		//String object that contains the name "Shakespeare"
		String name = "Shakespeare";
		
		//display the string referenced by the name variable
		System.out.println("In main the String name is " + name);
		
		//call the changeName method
		changeName(name);
		
		//display the string referenced by the name variable now
		System.out.println("In main the String name is still " + name);
	}
	
	public static void changeName(String str)
	{
	   //BEFORE ANY OTHER STATEMENTS IN THIS METHOD EXECUTE, str and name
		//contain the address to the same String object
	
		//creates another string object containig "Dickens" and have
		//the str parameter variable reference the object
		str = "Dickens";
		
		//Display the string referenced by str
		System.out.println("In the changeName method, the String str is " + str);
	}
	
}