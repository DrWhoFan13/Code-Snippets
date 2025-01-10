import java.util.Scanner;
import java.text.DecimalFormat;

public class testGrade
{

	public static void main(String[]args)
	{
    Scanner keyboard = new Scanner(System.in);
    int TestScoreA;
    int TestScoreB;
    int TestScoreC;
    int TestScoreD;
    int TestScoreE;
    int input;
    int TestScoreAvg;
    double TestScoreAvgLet;
    
    do
		{
			showMenu();
         input = keyboard.nextInt();
         TestScoreA = keyboard.nextInt();
         TestScoreB = keyboard.nextInt();
         TestScoreC = keyboard.nextInt();
         TestScoreD = keyboard.nextInt();
         TestScoreE = keyboard.nextInt();
         determineGrade();
         calcAverage();
      }
      
   while(
   
	public static void showMenu()
	{
    System.out.println("Please enter the first score between 0 and 100:");
    System.out.println("Please enter the second score between 0 and 100:");
    System.out.println("Please enter the third score between 0 and 100:");
    System.out.println("Please enter the fourth score between 0 and 100:");
    System.out.println("Please enter the fifth score between 0 and 100:");
   }
   
   public static void calcAverage()
      {
       TestScoreAvg = TestScoreA + TestScoreB + TestScoreC + TestScoreD + TestScoreD / 5;
       System.out.println("The average test score is:" + TestScoreAvg);
      }
      
   public static void determineGrade()
   {
      if(input >=90)
      {
       system.out.println ("The letter grade is A");
      }
      
      else if (input >=80)
      {
      system.out.println ("The letter grade is B");
      }
      
      else if (input >=70)
      {
      system.out.println ("The letter grade is C");
      } 
      
      else if (input >=60)
      {
      system.out.println ("The letter grade is D");
      }
            
      else if (input <60)
      {
      system.out.println ("The letter grade is F");
      }
      
    }
}