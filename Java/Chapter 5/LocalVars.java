/*This example shows that a variable declared within a method is a local variable and can
only be seen by that method.  The scope of that variable is only within the method in which
it is declared as is the lifetime of that variable. Once the method ends all local variables
in that method are destroyed, they are not saved and can't be accessed later.  Parameter
variables are local variables in a method so their scope and lifetime is also limited to 
the time the method is executing*/

public class LocalVars
{

	public static void main(String[]args)
	{
	   //we could even create yet another birds variable here if we wanted that would be
		//different than both of the birds variables in the texas and california methods
		texas();
		california();
	}
	
	public static void texas()
	{  
	   //a different birds variable, this method can't see the birds variable in the
		//california method, this variable also can't be seen by main because of it's scope
		//and the fact that it is destroyed once the method finishes executing
		int birds = 5000;
		System.out.println("In texas there are " + birds + " birds.");
	}
	
	public static void california()
	{
		//a different birds variable, this method can't see the birds variable in the
		//texas method this variable also can't be seen by main because of it's scope
		//and the fact that it is destroyed once the method finishes executing
		int birds = 3500;
		System.out.println("In california there are " + birds + " birds.");
	}

}