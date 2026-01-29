// Practical 3A -Question 5
// Oisin - L00172671
// 11.10.2022
// Program to work out an order

import java.util.Scanner;
public class ComputerOrders
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Assign variables
      double price, totalcost, quantity;
      
      //Assign value to rpice1
      price = 550;
      
      //Display prompt which asks user to enter the qunatity of computers they will be ordering
      System.out.println("Please enter quantity of computers you would like to order: ");
      quantity = keyboardIn.nextDouble();
      
      //Assign if variable  
         if ( quantity >= 30)
         {
         //pefrom cal to work out price
         totalcost = 500 * quantity;
         
         //Display the total order cost on screen
         System.out.println("You have ordered " + quantity);
         System.out.println("Your total cost will be: " +totalcost);
         }
         //Assign variable to less than 30
         if (quantity < 30)
         {
         // Peform cal to work out price
         totalcost = price * quantity;
         
         //Display total order cost on screen
         //Display the total order cost on screen
         System.out.println("You have ordered " + quantity);
         System.out.println("Your total cost will be: " +totalcost);
         }

              
   } //end main method

} //end class


