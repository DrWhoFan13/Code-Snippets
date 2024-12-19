import java.util.Scanner;
class isPalindrome {
    public static void main(String[] args) {
    Scanner scnr = new Scanner (System.in);
	  int[] userValues = new int[20];
    int num, reversedNum = 0, remainder;
      
      System.out.print("Input the number you want to check for Palindrome (max of 20 digits): ");
      num = scnr.nextInt();
      int originalNum = num;
      
      while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
      }
      
      if (originalNum == reversedNum) {
        System.out.println(originalNum + " is a Palindrome.");
      }
      else {
        System.out.println(originalNum + " is not Palindrome.");
      }
    }
  }