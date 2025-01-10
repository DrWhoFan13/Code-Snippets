import java.util.Scanner;
import java.text.DecimalFormat;

public class conversion
{

	public static void main(String[]args)
	{
    Scanner keyboard = new Scanner(System.in);
    int menuchoice;
    int input = 0;
    int meters;
    
    do
		{
			showMenu();
         menuchoice = keyboard.nextInt();
			input = keyboard.nextInt();
         meters = keyboard.nextInt();
      }
   while( 
          
   public static void showMenu()
	{
     System.out.println("METER CONVERSION\n");
     System.out.println("1) Convert to Kilometers\n");
     System.out.println("2) Convert to Inches\n");
     System.out.println("3) Convert to Feet\n");
     System.out.println("4) Quit the Program\n");
     System.out.println("Please make a selection:\n");
     
     if(choice == 1)
     {
      calcKilometers
      System;out.println(input + "meters is" + kilooutput + "kilometers");
     }
     
     else if(choice == 2)
     {
      calcInches
      System;out.println(input + "meters is" + inchoutput + "inches");
     }
     
     else if(choice == 3)
     {
      calcFeet
      System;out.println(input + "meters is" + feetoutput + "feet");
     }
     
	  else if(choice != 4)
	  {
		System.out.println("Invalid Selection");
	  }
     
     public static void calcKilometers()
     {
      meters * .0001 = kilooutput;
      System.out.println(meter + "meters is" + kilooutput + "kilometers");
     }
     
     public static void calcInches()
     {
      meters * 39.37 = inchoutput;
      System.out.println(meter + "meters is" + inchoutput + "inches");
     }
     
     public static void calcFeet()
     {
      meters * 3.281 = feetoutput;
      System.out.println(meter + "meters is" + feetoutput + "feet");
     }
 }