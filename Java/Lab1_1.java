import java.util.Scanner;

public class Lab1_1 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Please input how many numbers you want to invert, then follow it up with the numbers:");

      int[] userList = new int[20];
      int userInput;
      int numElements = 20;
      int i;                
      numElements = scnr.nextInt();   
    
      for (i = 0; i < numElements; i++)
      {
         userInput=scnr.nextInt();
         userList[i]=userInput;
      }
      System.out.print("These are the outputs: ");
      for (i = numElements - 1; i >= 0; i--)
      {
         System.out.print(userList[i]+" ");
      }
   }
}
