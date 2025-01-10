//Program Example - Performing Calculations on a Circle using only one Main Method

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CircleOnlyMainMethod
{
   public static void main(String[] args)
   {
      //declare variables
      String inputStr;
      int radius;
      double area;
      double circumference;
		
		//to format output to four decimal places
		DecimalFormat formatter = new DecimalFormat("#0.0000");
      
      //get user input in a JOptionPane and read input into the radius variable    
      inputStr = JOptionPane.showInputDialog("Enter the radius of the circle:");
      radius = Integer.parseInt(inputStr);
      
     //calculate the area
      area = Math.PI*radius*radius;
      
      //calculate the circumference
      circumference = (2*radius)*Math.PI;
      
      //print the area
      System.out.printf("The area of the circle is %s" , formatter.format(area));
      
      //print the circumference
      System.out.printf("\nThe circumference of the circle is %s" , formatter.format(circumference));
      
   }
}
