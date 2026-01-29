// Practical 3A- Question 3
// Oisin - L00172671
// 11.10.2022
// Program to determin if a number is greater than 100

import java.util.Scanner;
public class NumberValues
 {

   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Assign value to number
      double num = 100;
      
      //Display prompt which asks user to enter a number
      System.out.println("Please enter a number: ");
      num = keyboardIn.nextDouble();
      
         //Assign if variable  greater than 100
         if ( num > 100)
         {
         System.out.print("Your number is greater than 100");
         }
         //Assign variable to less than 100
         if (num < 100)
         {
         System.out.print("Your number is less than 100");
         }
              
   } //end main method

} //end class

