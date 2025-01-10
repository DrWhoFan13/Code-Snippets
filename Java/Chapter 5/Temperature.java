/*This program, gets 4 fahrenheight temperatures from the user, averages them, 
converts the average to centegrade and then prints out a general statement about the
average temperature based on what it is*/


//Notice the wildcard character *, this imports all of the classes in the java.util.* package
import java.util.*;

class Temperature
{
	public static void main(String[]args)
	{
		//declare variables
		double temp1,temp2,temp3,temp4;
		double average;
		double centigrade;
		Scanner keyboard = new Scanner(System.in);
		
		//get input
		System.out.println("Please enter the first temperature:");
		temp1 = keyboard.nextDouble();
		System.out.println("Please enter the second temperature:");
		temp2 = keyboard.nextDouble();
		System.out.println("Please enter the third temperature:");
		temp3 = keyboard.nextDouble();
		System.out.println("Please enter the fourth temperature:");
		temp4 = keyboard.nextDouble();
		
		//call the calcAverage method and store the method's return value in the average
		//variable
		average = calcAverage(temp1, temp2, temp3, temp4);
		
		System.out.println("The Average temperature is " + average);
		
		//call the convertToCentigrade method and store the method's return value in the
		//centigrade variable
		centigrade = convertToCentigrade(average);
		
		System.out.println("The centigrade temperature is " + centigrade);
	
	   //call the VOID method analyzeTemperature that prints out a statement
		analyzeTemperature(average);
	}
	
//calcAverage method definition
   public static double calcAverage(double t1, double t2, double t3, double t4)
   {
      return (t1+t2+t3+t4)/4;
   }
   
   //convertToCentigrade method definition
   public static double convertToCentigrade(double t1)
   {
      return 5.0/9.0*(t1-32);
   }
   
   //analyze temperature method definition
   public static void analyzeTemperature(double t1)
   {
      if(t1 >= 90)
	   {
         System.out.println("The temperature is above average.");
      }
      
      else if(t1 > 70 && t1 < 89)
      {
         System.out.println("The temperature is average.");
      }

      else
      {
         System.out.println("The temperature is below average."); 
      }
   }
}