//Practical 3A -Question 1
//Oisin - L00172671
//11.10.2022
//Program to show bank balance

import java.util.Scanner;
public class BankBalance
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Assign value to bank balance
      double bankBalance = 0;
      
      //display prompt which asks user to enter their bank balance
      System.out.print("Please enter your bank balance: ");
      bankBalance = keyboardIn.nextDouble();
      
      //Assign if variable to bank balance
      if(bankBalance > 0)
      {
         
         //display text on screen telling user that they arein credit
         System.out.println("You are in credit");
      }
   } //end main method

} //end class