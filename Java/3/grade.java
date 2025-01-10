//Pseudocode:
//Step 1: Set up dialog boxes for total questions and correct questions
//Step 2: Have user input total questions and correct questions
//Step 3: Divide correct questions by total
//Step 4: Display percentage of correct questions

import javax.swing.JOptionPane;
         
public class grade
{
   public static void main(String[]args)
   {
      String inputStr;
      String totalright;
      
      int totalqs;
      double totalqsright;
      double grade;
      
      inputStr = JOptionPane.showInputDialog("How many questions there are on the test?");
      totalqs = Integer.parseInt(inputStr);
      inputStr = JOptionPane.showInputDialog("How many did you get correct?");
      totalqsright = Double.parseDouble(inputStr);
      grade = (totalqsright / totalqs) * 100;
      JOptionPane.showMessageDialog(null,"You got " + totalqsright + " out of " + totalqs + " correct. Your percentage is " + grade + "%");
      }
}