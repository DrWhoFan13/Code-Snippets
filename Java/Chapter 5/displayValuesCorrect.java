/*This is an example of a void method (returns no value) with one argument.  The method is 
REUSED....called more than once in the program.  This also shows that as long as the argument
to a method is converted into the correct type of the parameter it is legal*/

public class displayValuesCorrect
{

  //main method
  public static void main(String[] args)
  {
     int x = 5;
	  
	  System.out.println("Each time the displayValue method call is executed, control of " +
	                     " \nthe program passes to the displayValue method and the arguments " +
								" \nin the method calls are passed to the displayValue method parameter.\n");
	  displayValue(10);
	  displayValue(x);
	  displayValue(x + 20);
	  displayValue(Integer.parseInt("850"));
  }
  
  //display value method
  public static void displayValue(int num)
  {
    System.out.println("The value is " + num);
  }
}