import java.util.Scanner;
public class Lab2
{

  public static int digitCount(int n)
  {
      if (n<10){
          return 1;
      }
      else {
          return 1 + digitCount(n/10);
      }
  }

  public static void main (String[]args)
  {
	Scanner scnr = new Scanner (System.in);
	System.out.print("Print the number whose digits you want counted: ");
	int num, digits;

	  num = scnr.nextInt();
	  digits = digitCount (num);
	  System.out.println ("Number of digits: " + digits);
  }
}