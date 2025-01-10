//Pseudocode:
//Step 1: Create scanners for Salesperson, Cars Sold, and Bonus
//Step 2: Have user input Salesperson, Cars Sold, and Bonus
//Step 3: Multiply Cars Sold by 1000
//Step 4: Display the results

import java.util.Scanner;
public class bonus
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            String name;
            double carssold;
            double bonus;
                        
            System.out.println("What is the name of the Sales Person?");
            name = keyboard.nextLine();
            
            System.out.println("How many cars did " + name + " sell this month?");
            carssold = keyboard.nextDouble();
            bonus = (carssold) * 1000;
            System.out.println(name +"'s bonus for the month is $" + bonus +".");
	}
}