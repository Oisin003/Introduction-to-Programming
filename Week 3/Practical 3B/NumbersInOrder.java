// Practical 3B - Question1
// Oisin - L00172671
// 13.10.2022
// Program to display numbers in order

import java.util.Scanner;
public class NumbersInOrder
 {

   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Assign Variables
      int num1, num2;
      
      //Display prompt asking user to enter a number
      System.out.println("Please enter your first number: ");
      num1 = keyboardIn.nextInt();
      
      //Display prompt asking user to enter their second number
      System.out.println("Please enter your second number: ");
      num2 = keyboardIn.nextInt();
      
         //If num 1 is less than num 2 display num 1 first
         if (num1 < num2)
         System.out.print(+num1);
         //Else if num 2 is less than num 1 display nuym 2 first
         else 
         System.out.print(+num2);
               
   } //end main method

} //end class

