// Practical 3C - Question 4
// Oisin - L00172671
// 11.10.2022
// Program to determine credit limit

import java.util.Scanner;
public class CreditLimit
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double creditlimit, purchases, amount, total, ftotal;
      
      //Display prompt asking user to enter their credit limit and their purchases to date
      System.out.println("Please enter your credit limit:");
      creditlimit = keyboardIn.nextDouble();
      System.out.println("Please enter your purchases:");
      purchases = keyboardIn.nextDouble();
      
       
      
      if (purchases >= creditlimit)
      {
      total = purchases * 0.1;
      ftotal = purchases + total;
      System.out.println("Your total is: " + ftotal);
      }
      
      if (purchases <= creditlimit)
      {
      total = purchases * 0.15;
      ftotal = purchases - total;
      System.out.println("Yourtotal is: " + ftotal);
      }
      
    } //end main method

} //end class



      
