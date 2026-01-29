// Practical 3C - Question 2
// Oisin - L00172671
// 13.10.2022
// Program to determine if num1 is a multiple of num2

import java.util.Scanner;
public class Multiples
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double num1, num2, answer, mul;
      
      //Display text that prompts user to enter 2 numbers
      System.out.print("Please enter the first number: ");
      num1 = keyboardIn.nextDouble();
      System.out.print("Pleae enter the second number: ");
      num2 = keyboardIn.nextDouble();
      //Peform cal to determine if num1 is a multiple of num2
      mul = (num1 / num2)%2;
      
      
      if (mul == 0)
      {
      System.out.print("Number 1 is a multiple of number 2");
      }
      
      if (mul != 0)
      {
      System.out.print("Number 1 is not a multiple of number 2");
      }
      
    } //end main method

} //end class

