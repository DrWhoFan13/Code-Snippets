//Pseudocode:
//Step 1: Set up a dialog box for retail price
//Step 2: Have user input retail price
//Step 3: Multiply retail price by .4
//Step 4: Display the profit earned

import javax.swing.JOptionPane;
         
public class profit
{
   public static void main(String[]args)
   {
      String inputStr;
      String cbprofit;
      
      int price;
      double profit;
      
      inputStr = JOptionPane.showInputDialog("How much is the retail price of the circuit board?");
      price = Integer.parseInt(inputStr);
      profit = price * .4;
      JOptionPane.showMessageDialog(null,"The profit on a " + price + " circuit board is: " + profit);
      }
}