/*The Circle Program from the beginning of class rewritten using methods*/
import javax.swing.*;

public class CircleMethods
{
	public static void main(String[] args)
	{
		//declare variables - notice we have variables to hold data
		//for two different circles
		//the string variables allow us to print the data on each circle
		String name1, name2;
	   int radius1, radius2;
		double area1, area2;
		double circumference1, circumference2;
		
		name1 = "Circle1";
		name2 = "Circle2";
		
		//get user input for the first circle		
		radius1 = getInput(name1);
		
		//get user input for the second circle
		radius2 = getInput(name2);
		
		//calculate the area for the first circle and return it to the calling program
		area1 = getArea(radius1);
		
		//calculate the area for the second circle and return it to the calling program
		area2 = getArea(radius2);
		
		//get the circumference for the first circle and return it to the calling program
		circumference1 = getCircum(radius1);
		
		//get the circumference for the second circle and return it to the calling program
		circumference2 = getCircum(radius2);
		
		//print the area and circumference of the first circle
		printArea(area1, name1);		
		printCircum(circumference1, name1);
		
		System.out.println();
		
		//print the area and circumference of the second circle
		printArea(area2, name2);		
		printCircum(circumference2, name2);
		
		System.out.println();
				
	}
	
	//this void method takes the circle name and asks the user to enter the radius
	//for that circle  (one parameter variable CircleName)
	public static int getInput(String circleName)
	{
		String inputStr;
		int rad;
		
		inputStr = JOptionPane.showInputDialog("Enter the radius of: " + circleName);
		return rad = Integer.parseInt(inputStr);
	}
	
	
	//this value returning method takes a radius for a circle and returns a double 
	//containing the area of a circle with that radius to the calling method 
	//(one parameter radius)
	public static double getArea(int rad)
	{
		return Math.PI*rad*rad;
	}
	
	//this value returning method takes a radius for a circle and returns a double 
	//containing the area of a circumference with that radius to the calling method 
	//(one parameter radius)
	public static double getCircum(int rad)
	{
		return (2*rad)*Math.PI;
	}
	
	
	//this void method prints the area of a circle and that circle's name.
	public static void printArea(double area, String name)
	{
		System.out.println("The area of " + name+ " is " + area);
	}
	
	//this void method prints the circumlference of a circle and that circle's name.
	public static void printCircum(double circum, String name)
	{
		System.out.println("The circumference of " + name + " is " + circum);
	}
}