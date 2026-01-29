// Practical 3B - Question2
// Oisin - L00172671
// 13.10.2022
// Program to display numbers in order

import java.util.Scanner;
public class StoreDiscounts
 {

   public static void main(String [] args)
   {
    Scanner keyboardIn = new Scanner(System.in);
      
      double game1, game2, discount1, discount2, totalcost, amountdue, famount;
      
      //Assign value to discount 1
      discount1 = 0.2;
      //Assign value to discount 2
      discount2 = 0.1;
      
      //Display prompt on screen asking user to enter the price of game 1
      System.out.print("Please enter the price of the first game: ");
      game1 = keyboardIn.nextDouble();
      //Display prompt on screen asking user to enter the price of game 2
      System.out.print("Please enter the price of game 2: ");
      game2 = keyboardIn.nextDouble();
      
      //Perform cal to work out total cost of the games
      totalcost = game1 + game2;
      
         if (totalcost < 50)
         {
         //peform cal to work out discount 1
         amountdue = totalcost * discount1;
         famount = totalcost - amountdue;
         //Display text on screen which tells the user the total, the discount due and the total amount due
         System.out.println("Your total amount due is" + totalcost);
         System.out.println("Your discount is: " + discount1);
         System.out.println("Your total is: " + famount);
         }
         
        if (totalcost > 50)
         {
         //peform cal to work out discount 2
         amountdue = totalcost * discount2;
         famount = totalcost - amountdue;
         //Display text on screen which tells user the total , thr discount due and the total amount
         System.out.println("Your total amount due is due is: " + totalcost);
         System.out.println("Your discount is: " +discount2);
         System.out.println("Your total is: "+ famount);
         }
         
                          
   } //end main method

} //end class


         
         
         
         
         
         
                
