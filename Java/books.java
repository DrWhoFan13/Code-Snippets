import java.util.Scanner;
import java.text.DecimalFormat;

public class books
{
public static void main(String[] args)
  {
  
	  Scanner keyboard = new Scanner(System.in);
     DecimalFormat formatter = new DecimalFormat("#0.00");
	  double TwelveMonthMembership = 99.00;
	  double SixMonthMembership = 50.50;
     int SixMonthSold = 0;
     int TwelveMonthSold = 0;
     double TotalProfits;
	  int choice;
     
     do
	  {
	    System.out.println("\nBOOK CLUB MEMBERSHIP MENU");
		 System.out.println("1) Sell a Six Month Membership");
		 System.out.println("2) Sell a Twelve Month Membership");
		 System.out.println("3) Quit the Program");
		 System.out.println("Make a selection by choosing a number:1");
		 
		 choice = keyboard.nextInt();
       
       if(choice == 1)
		 {
		   SixMonthSold++;
			System.out.println("You sold a six month membership.\n");
		 }
       
         else if(choice == 2)
		 {
		   TwelveMonthSold++;
			System.out.println("You sold a twelve month membership.\n");
		 }
       
       else if(choice != 3)
		 {
		   System.out.println("You have made an invalid selection.\n");
		 }
       
       else
       {
         TotalProfits = (TwelveMonthSold * TwelveMonthMembership) + (SixMonthSold * SixMonthMembership);
	      System.out.println("The total book club membership sales were $" + formatter.format(TotalProfits));
       }
		
	  }while(choice != 3);
									
	  
  }
}