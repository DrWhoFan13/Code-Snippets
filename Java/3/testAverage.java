//Pseudocode:
//Step 1: Create scanners for Test Score One, Test Score Two, and Test Score 3
//Step 2: Have user input test scores
//Step 3: Add all test scores together
//Step 4: Divide them all by three
//Step 5: Display the result

import java.util.Scanner;
public class testAverage
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            double testscoreone;
            double testscoretwo;
            double testscorethree;
            double testscoreaverage;
            
            System.out.println("Please enter the first test score:");
            testscoreone = keyboard.nextDouble();
            System.out.println("Please enter the second test score:");
            testscoretwo = keyboard.nextDouble();
            System.out.println("Please enter the third test score:");
            testscorethree = keyboard.nextDouble();
          
            testscoreaverage = (testscoreone+testscoretwo+testscorethree) / 3.0;
            System.out.println("The test score average is " + testscoreaverage);
	}
}