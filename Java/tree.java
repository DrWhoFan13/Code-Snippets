import java.util.Scanner;
import java.text.DecimalFormat;

public class tree
   {
      public static void main(String[] args)
         {

           Scanner keyboard = new Scanner(System.in);
//the argument to Decimal format is a string pattern - always in " " also never use 0.00 as a pattern
//DecimalFormat formatter = new DecimalFormat(0.00);
            DecimalFormat formatter = new DecimalFormat("#0.00");
            int treeHeight;
            int numTrees;
//double forDelivery; forDelivery is 1 or 0 those are int not double
            int forDelivery;
            double singleTree = 0;
            double treeCost;
            double deliveryCost = 0;
            double totalCharges;

            System.out.println("How many trees do you want to purchase?\n");
//numTrees = keyboard.nextLine();
//I didn't notice your input is wrong nextLine is for strings only next Int is for ints
            numTrees = keyboard.nextInt();

            System.out.println("Enter the height of trees you want to purchase.\n");
            treeHeight = keyboard.nextInt();

            System.out.println("Would you like the trees delivered? Enter 1 for Yes, Enter 0 for No.\n");
            forDelivery = keyboard.nextInt();

            if (treeHeight < 3)
            {
            singleTree = 39.00;
            }

            else if (treeHeight >= 3 && treeHeight <=5)
            {
            singleTree = 69.50;
            }

            else if (treeHeight >= 6 && treeHeight < 8)
            {
            singleTree = 99.00;
            }

            else //if (treeHeight > 8);you still have this here and the semicolon
            {
            singleTree = 199.00;
            }

//treeCost = numTrees * singleTree *treeHeight;
//I think you forgot to fix this - see recording tree cost is numTrees * single tree
            treeCost = numTrees * singleTree;

            if (forDelivery == 0)
            {
            deliveryCost = 0;
            }

            else //(forDelivery == 1)
                 //;you still have the semicolon and you never put a boolean expression after an else
            {

            if (numTrees < 5)
            {
            deliveryCost = numTrees * 10;
            }

            else //if (numTrees >= 5)//;you still have the semicolon and it should be else
            {
            deliveryCost = 50;
            }
            }

            totalCharges = treeCost + deliveryCost;

//you'll need to fix some things here..first \n not /n is a new line so fix those
//second you forgot to use the formatter..formatter.format(treeCost)...see Ch 3 Part 2
//but for now it's compiling and the basics are fixed
System.out.println("Green Fields Landscaping\n");
System.out.println("Evergreen Tree Invoice\n");
System.out.println(numTrees + " Trees at $" + treeHeight + " each: $" + treeCost +"\n");
System.out.println("Delivery Charge: $" + deliveryCost + "\n");
System.out.println("_______\n");
System.out.println("TOTAL: $" + totalCharges + "\n");
            }
}