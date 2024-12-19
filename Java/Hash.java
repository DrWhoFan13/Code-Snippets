import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;

public class Hash {
       
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      HashMap<String, Double> studentGrades = new HashMap<String, Double>();
      
      studentGrades.put("Harry Rawlins", 84.3);
      studentGrades.put("Stephanie Kong", 91.0);
      studentGrades.put("Shailen Tennyson", 78.6);
      studentGrades.put("Quincy Wraight", 65.4);
      studentGrades.put("Janine Antinori", 98.2);

      System.out.print("Enter a student's name to change their grade: ");
      String userInput = scnr.nextLine();
      if (studentGrades.containsKey(userInput)){
         System.out.println(userInput +"'s grade is: " + studentGrades.get(userInput));
         System.out.print("Enter " + userInput + "'s new grade: ");
         double newGrade = scnr.nextDouble();
         studentGrades.put(userInput, newGrade);
         System.out.print(userInput +" 's new grade is: " + newGrade);
      }
      else {
         System.out.print("Student not found");
      }
      scnr.close();
   }
}