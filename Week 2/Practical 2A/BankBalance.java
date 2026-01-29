// Practical 2A - Question 5
// Oisin
// 4.10.2022
// Program that prompts a user to enter r their current bank balance,and the amount they wish to deposit. The program will then display their balance after the deposit.

import java.util.Scanner;
public class BankBalance
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Assign variable to hold curBal deposit remainder
      double curBal, deposit, remainder;
      
      // Display prompt to ask user to enter their currnt bank balance
      System.out.print("Please enter your current bank balance ");
       curBal = keyboardIn.nextDouble();
       
       //Display prompt to ask user the amount they wish to desposit
       System.out.print(" Please enter the amount you wish to desposit ");
       deposit = keyboardIn.nextDouble();
       
       //peform cal to find remainder
       remainder = curBal - deposit;
       
       //display new current balance on screen
       System.out.print("Your new current balance is "+ remainder);
   }
}
       
       
     
      
      
