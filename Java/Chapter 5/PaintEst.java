import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintEst
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		double sqFt = 0.0;
		double totalSqFt = 0.0;
		int numRooms = 0;
		double costPerHour;
		double costPerGal;
		double numHours;
		double numGallons;
		double laborCost;
		double paintCost;
		int selection;
		
		do
		{
			displayMenu();
			selection = keyboard.nextInt();
			
			if(selection == 1)
			{
				totalSqFt = 0.0;  
				System.out.println("How many rooms?");
				numRooms = keyboard.nextInt();
				
				for(int count = 1; count <= numRooms; count++)
				{
					System.out.println("How many square feet in room #" + count + "?");
					sqFt = keyboard.nextDouble();
					totalSqFt = totalSqFt + sqFt;
				}
				
				numGallons = numGallons(totalSqFt);
				System.out.println("NumGallons = " + numGallons);
				
				numHours = numHours(totalSqFt);
				
				System.out.println("What is the cost per hour?");
				costPerHour = keyboard.nextDouble();
				
				laborCost = laborCost(numHours, costPerHour);
				
				System.out.println("What is the cost per gallon?");
				costPerGal = keyboard.nextDouble();
				
				paintCost = paintCost(numGallons, costPerGal);
				
				displayEstimate(paintCost, laborCost);
				
			}
			
			else if(selection != 2)
			{
				System.out.println("INVALID SELECTION");
			}
			
		}while(selection != 2);
	
	}
	
	public static void displayMenu()
	{
		System.out.println("PAINTING JOB ESTIMATE");
		System.out.println("---------------------");
		System.out.println("1)  Calculate Estimate");
		System.out.println("2)  Quit the Program");
  		System.out.println("Please make a selection:");
	}
	
	public static double numGallons(double numSqFt)
	{
		return numSqFt/115;
	}
	
	public static double numHours(double numSqFt)
	{
		return (numSqFt/115) * 8;
	}
	
	public static double laborCost(double hours, double costPerHr)
	{
		return hours * costPerHr;
	}
	
	public static double paintCost(double numGal, double costPerGal)
	{
		return numGal * costPerGal;
	}
	
	public static void displayEstimate(double paintCost, double laborCost)
	{
		double totalCost = paintCost + laborCost;
		
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		
		System.out.println("PAINT JOB ESTIMATE");
		System.out.println("------------------------");
		System.out.println("Paint Cost: " + formatter.format(paintCost));
		System.out.println("Labor Cost: " + formatter.format(laborCost));
		System.out.println("Total Cost: " + formatter.format(totalCost));
		System.out.println();
	}
}

