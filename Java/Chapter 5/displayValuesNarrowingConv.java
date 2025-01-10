/*Example:  The display value method cannot be passed a double arguemnt unless a cast
is done because Java does not automatically perform narrowing conversions*/

public class displayValuesNarrowingConv
{

  //main method
  public static void main(String[] args)
  {
     //x is now a double
     double x = 5.1;
     
     System.out.println("You can NOT pass data of higher ranked data types as arguments\n" + 
                       "to methods with parameters that have lower ranked data types" + 
                       " \nbecause of the narrowing conversion rule. \nA CAST IS REQUIRED.\n");
    
     //a cast is needed because Java won't perform the narrowing conversion
	  //The .1 will also be cut off in the cast...truncated
     displayValue((int)x);
     displayValue((int)x + 20);
  }
  
  //display value method – Notice the parameter num is an int 
  public static void displayValue(int num)
  {
    System.out.println("The value is " + num);
  }
}
