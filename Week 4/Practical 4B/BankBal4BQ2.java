// Practical 4B - Question 2
// Oisin - L00172671
// 20.10.2022
// Program to display bank balance

import java.util.Scanner;
public class BankBal4BQ2
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double bal, accountBal, overdraw, credit;
     
      //Assign value to Account Balance
      System.out.print("Please enter Your Account Balance:");
      accountBal = keyboardIn.nextDouble();

      
      //Read the bal of an account
      System.out.print("Please enter your deposit");
      bal = keyboardIn.nextDouble();
      
      
         //Display text on screen
         //Account is overdrawn
         if(bal > accountBal)
         { 
            //Peform cal to work out overdraw
            overdraw = accountBal - bal;
            System.out.print("Your account is overdrawn by: "+overdraw);
         }
         else
         {
            
            //Account is in credit
            //Peform cal to wrok out credit
            credit = accountBal - bal;
            System.out.print("Your account is in credit by:" +credit);
         }
         
       } //end main method

} //end class

         
                  
