import java.util.Scanner;
import java.text.DecimalFormat;

public class LawnMowing
{

	public static void main(String[]args)
	{
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("#0.00");
    int menuchoice;
    int sqft;
    int weeksmowing;
    int wmfchoice;
    int paymethodchoice;
    int weeklymowfee;
    int totalmowcost;
    int totalpayment;
    
   do
      {
       showMenu();
       menuchoice = keyboard.nextInt();
       sqft = keyboard.nextInt();
       weeksmowing = keyboard.nextInt();
       wmfchoice = keyboard.nextInt();
      }
   
   while(   
	
     System.out.println("Lawn Mowing Invoice Generator\n"));
     System.out.println("1) Calculate and Display Invoice\n");
     System.out.println("2) Quit Program\n");
     
     if(menuchoice == 1)
     {
      System.out.println("How big is the lawn?");
      System.out.println("How many weeks will be spent mowing?");
      calcWeeklyMowFee
      System;out.println("How will you be paying?");
       {
       if(paymethodchoice == 1)
          {
          calcTotalMowCost
          billmenu;
          }
          
       else if(paymethodchoice == 2)
          {
          calcServiceCharge
          billmenu;
          }
       
       else if(paymethodchoice != 3)
          {
          System.out.println("You have made an invalid selection.");
          }
       
     
     else if(menuchoice == 2)
     {
     System.out.println("Thank you for using the Lawn Mowing Invoice Generator. Goodbye.");
     }
     
     else if(menuchoice != 3)
     {
     System.out.println("You have made an invalid selection.");
     }
    }
	
  public static void calcWeeklyMowFee
    (
    {
    if(wmfchoice < 350)
     {
     weeklymowfee = 20.00;
     }
     
    else if(wmfchoice >=350 || wmfchoice <550)
     {
     weeklymowfee = 30.00;
     }
     
    else if(wmfchoice >=550)
     {
     weeklymowfee = 40.00;
     }
    }
    
   public static void calcTotalMowCost
   (
    {
     totalmowcost = weeklymowfee * weeksmowing;
    }
   
   public static void calcServiceCharge
   (
   {
    {
    totalservicecharge = weeksmowing * 1.20;
    }
   }
    
   public static void calcTotalPayment
   (
    {
     totalpayment = totalservicecharge + totalmowcost;
    }
    
   public static void billmenu
   (
    {
     System.out.println("LISA'S LAWN MOWING SERVICE - INVOICE");
     System.out.println("/n");
     System.out.println("Size of Lawn:     " + sqft);
     System.out.println("Number of Weeks:     " + weeksmowing);
     System.out.println("Weekly Mowing Fee:     $" + weeklymowfee);
     System.out.println("/n");
     System.out.println("Total Mowing Fee:      $" + totalmowcost);
     System.out.println("Service Charge:        $" + totalservicecharge);
     System.out.println("/n");
     System.out.println("TOTAL COST:            $" + totalpayment);
     
    }
   }
  }
 }