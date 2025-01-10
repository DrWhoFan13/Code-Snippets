/*Example:  displayValue() method with a widening conversion.  The displayValue method call
has a short as an argument when the parameter variable is an int.  An int is higher ranked
than a shrot so the method call is legal and Java automatically performs the
conversion (short to int)*/

public class displayValuesWideningConv
{

  //main method
  public static void main(String[] args)
  {
     //x is now a short
     short x = 5;
     
     System.out.println("You can pass data of lower ranked data types as arguments\n" + 
	                    " to methods with parameters that have higher ranked data types" + 
							  " because of teh widening conversion rule.\n");
    
     displayValue(x);
     displayValue(x + 20);
  }
  
  //display value method
  public static void displayValue(int num)
  {
    System.out.println("The value is " + num);
  }
}
