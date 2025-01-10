//Pseudocode:
//Step 1: Create variables firstnum, secondnum, thirdnum, total, and average
//Step 2: Input values for nums
//Step 3: Input equation for total
//Step 4: Divide total by 3.0 to get average

public class Average
{
   public static void main
( String [] args)
   {
   double firstnum = 105.62;
   double secondnum = 89.352;
   double thirdnum = 98.67;
   double total = firstnum + secondnum + thirdnum;
   double average = total / 3.0;
   
   System.out.println("The total is " + total);
   System.out.println("The average is " + average);
   }
}