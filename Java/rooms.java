import java.util.Scanner;

public class rooms
{
public static void main(String[] args)
  {
  
	  Scanner keyboard = new Scanner(System.in);
     int counter = 1;
     int numTimes;
     int floors;
     int floornum;
     int totalrooms;
     int occupiedrooms;   
     
       System.out.println("Please enter the number of floors in the hotel:");
       numTimes = keyboard.nextInt();
       
       while(counter <= numTimes)
         {
         System.out.println("Please enter the floor number");
         floornum = keyboard.nextInt();
                   
         System.out.println("Please enter the number of rooms on floor #: " + floornum);
         totalrooms = keyboard.nextInt();
         
         System.out.println("Please enter the number of occupied rooms on floor #: " + floornum);
         occupiedrooms = keyboard.nextInt();
         
         for (int floor = 1; floor <= floornum; ++floor)

          {

           if(floor != 13)

           {
           System.out.println("");
           }
           
         counter++;
                   }
         
          System.out.println("The Hotel has " + totalrooms + " Total Rooms.");
          System.out.println(occupiedrooms + " of the Rooms are occupied.");
          System.out.println(occupiedrooms%totalrooms);
          
          }
          }
}