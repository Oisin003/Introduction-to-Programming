//Practical 8B - Question 5
//Oisin - L00172671
//24.11.2022
//Program to display the amount of money in a bank account

import java.util.Scanner;
public class BankAccount8BQ5
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables 
      double current = 20, total, percent = 0.1, interest, totalValue;
      for(int count = 0 ; count <= 15; count++)
      {//open
         //Peform Cal
         current = current / 0.9;
         //Display Interest
         System.out.println("Interst at the end of the year " + count  + ":" + current);
      }//close
     }// end main method
}//end class
