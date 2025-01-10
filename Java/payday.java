import java.util.Scanner;
import java.text.DecimalFormat;

public class payday
{
public static void main(String[] args)
  {
  
	  Scanner keyboard = new Scanner(System.in);
     DecimalFormat formatter = new DecimalFormat("#0.00");
     int counter = 1;
     int numTimes;
     int dayno;
     int daysworked;
     int payfortheday;
     
       System.out.println("Please enter the number of days you worked:");
       numTimes = keyboard.nextInt();
       
       while(counter <= numTimes)
         {
         System.out.println("Please enter the day");
         dayno = keyboard.nextInt();
         
         System.out.println("Pay for day #" + dayno);
         payfortheday = keyboard.nextInt();

         //System.out.println(payfortheday);
         
         counter++;
         }
         }
         }