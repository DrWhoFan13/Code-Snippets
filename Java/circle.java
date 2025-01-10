import java.util.Scanner;
import java.text.DecimalFormat;

public class circle
{
   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat formatter = new DecimalFormat("#,##0.0000");
      int choice;
      int radius = 0;
      double results;
      
      System.out.println("CIRCLE CALCULATOR MENU");
      System.out.println("1) Calculate the Area of a Circle");
      System.out.println("2) Calculate the Circumference of a Circle");
      System.out.println("3) Quit the Program");
      System.out.println("Make a selection by choosing a number:");
      
      choice = keyboard.nextInt();
      
      if(choice >=1 && choice <= 2)
		{
         System.out.println("Please enter the radius of the circle");
         radius = keyboard.nextInt();
      }
      switch(choice)
      {
         
        case 1:
               results = radius * radius * Math.PI;
               System.out.println("The area of the circle with radius " + radius + " is: " + formatter.format(results));
               break;
        case 2:
               results = 2 * radius * Math.PI;
               System.out.println("The circumference of the circle with radius " + radius + " is: " + formatter.format(results));
               break;
        
		  case 3:
				System.out.println("You have chosen to quit the program.");
				break;	
		   
		  default:
   		   System.out.println("You have made an invalid selection.");
      }
      
   }
}