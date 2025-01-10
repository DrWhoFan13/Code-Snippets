import java.util.Scanner;
import java.text.DecimalFormat;

public class cellplan
   {
      public static void main(String[] args)
         {
         
            Scanner keyboard = new Scanner(System.in);
            DecimalFormat formatter = new DecimalFormat("#0.00");
            double excessminutecost;
            int excessminutes;
            double overtimecharge;
            double basecost;
            double totalcost;
            String name;
            int selection;
            
      System.out.println("CELLPHONE BILL GENERATOR\n");
      System.out.println("1) PLAN 1: 500 Minute Plan");
      System.out.println("2) PLAN 2: Unlimited Minute Plan");
      System.out.println("3) Quit the Program");
      System.out.println("Please make a selection:");
      
      selection = keyboard.nextInt();
      
      if(selection >=1 && selection <= 2)
		{
      System.out.println("Please enter your name:");
      name = keyboard.nextLine();
      
      }
      switch(selection)
      {
      
      case 1:
            name = keyboard.nextLine();
            System.out.println("Please enter the number of extra minutes used");
            excessminutes = keyboard.nextInt();
            basecost = 24.99;
            excessminutecost = .18;
            overtimecharge = excessminutes * excessminutecost;
            totalcost = basecost+overtimecharge;
            System.out.println("CELL PHONE BILL");
            System.out.println("CUSTOMER: " + name + "\n"); 
            System.out.println("Base Cost:          $" + basecost);
            System.out.println(excessminutes + " Extra Minutes:  $" + formatter.format(overtimecharge));
            System.out.println("\n");
            System.out.println("Total Cost:         $" + formatter.format(totalcost));
            break;
            
      case 2:
            name = keyboard.nextLine();
            basecost = 59.99;
            System.out.println("CELL PHONE BILL");
            System.out.println("CUSTOMER: " + name + "\n"); 
            System.out.println("Base Cost:          $" + basecost);
            System.out.println("0 Extra Minutes:    $0.00\n");
            System.out.println("Total Cost:         $" + formatter.format(basecost));
            break;
            
      case 3:
				System.out.println("Thank you for using the Cell Phone Bill Generator. Goodbye.");
				break;
		   
		  default:
   		   System.out.println("You have made an invalid selection.");
      }
      
   }
}