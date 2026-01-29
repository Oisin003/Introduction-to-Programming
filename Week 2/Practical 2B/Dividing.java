// Practical 2B -Question 7
// Oisin - L00172671
// 6.10.2022
// Program to divide two numbers

import java.util.Scanner;
public class Dividing
{
   public static void main(String[ ] args)
   {
   
      Scanner keyboardIn = new Scanner(System.in);
      double num1, num2, answer, remainder;
      
      //Assign value to num1 and display it on screen
      System.out.print("Enter the first number: ");
      num1 = keyboardIn.nextDouble();
      
      //Assign vaule to num2 and display it on screen
      System.out.print("Enter the second number: ");
      num2 = keyboardIn.nextDouble();
      
      //Assign value to remainder
      remainder = num1%num2;
      
      
      answer = num1/num2;
      
      System.out.println(num1 + "divided" + num2 + "equals" + answer + "remainder" + remainder);
      
   }
}