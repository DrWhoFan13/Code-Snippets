import java.util.Scanner;
public class SquareMath
{
   public static void main (String[] args)
   { 
      Scanner keyboard = new Scanner( System.in );
      double num, square;          
      System.out.println("Enter an integer:");
      num = keyboard.nextInt();square = Math.sqrt(num) ; 
      System.out.println("The square of " + num + " is " + square);
   }
}