import java.util.Scanner;

public class letterCount
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int name;
      
      System.out.println("How many letters are in your name?");
      name = keyboard.nextInt();
      
      if(name < 8)
         {
            System.out.println("You don't have a long name");
         }
         
      else
         {
            System.out.println("You have a long name");
         }
   }
}