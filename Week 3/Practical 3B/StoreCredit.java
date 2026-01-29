// Practical 3B - Question 3
// Oisin - L00172671
// 12.10.2022
// Program to work out store credit

import java.util.Scanner;
public class StoreCredit
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double accountbal, purchase, newbal, creditlimit, fanswer;
      
      //Assign value to credit limit
       creditlimit = 1000;
      
      //Display prompt on screen asking user to enter their previous account balance
      System.out.println("Enter previous account balance ");
     accountbal = keyboardIn.nextDouble();
     //Display prompt on screen asking user to enter todays purchase
     System.out.println("Please enter todays purchase total: ");
     purchase = keyboardIn.nextDouble();
     
      //peform cal to work out new account balance
     newbal = accountbal + purchase;

          
      if (newbal >  creditlimit )
      {
      //Display text on screen
      System.out.println("Credit limit: " +creditlimit);
      System.out.println("Enter Purchases: " + accountbal);
      System.out.println("Enter todays purchases: " + purchase);
      //peform cal to work out
      fanswer = newbal - creditlimit;
      System.out.print("Credit limit exceeded by: " + fanswer );
      }
      
    else 
    
      {      
     
      //Display text on screen
      System.out.println("Credit limit: " +creditlimit);
      System.out.println("Enter Purchases: " + accountbal);
      System.out.println("Enter todays purchases: " + purchase);
      System.out.println("Credit limit not exceeded");
      
   }
      
                 
   } //end main method

} //end class


     
     
     
     


