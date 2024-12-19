import java.util.Scanner;

public class Lab3
{
  public static void main (String[]args)
  {
	Scanner scnr = new Scanner (System.in);
	int[] userValues = new int[20];
	int size;
	int left, right;
	boolean sorted;
	int i;
	
	System.out.print ("Enter the size of the array: ");
	size = scnr.nextInt();

    System.out.println("Enter the " + size + " numbers in the array, seperated by spaces: ");

	for (i = 0; i < size; i++){
    userValues[i] = scnr.nextInt();
    }

	System.out.print ("Enter start and end positions, separated by a space: ");

	left = scnr.nextInt();
	right = scnr.nextInt();

	sorted = true;

	for(i = left - 1; i < right - 1; i++){
	  if (userValues[i] > userValues[i+1])
	  {
	      sorted = false;
	      break;
	  }
	}
	if (sorted){
	System.out.println ("Sorted: yes");
  }
else{
	System.out.println ("Sorted: no");
  }
 }
}