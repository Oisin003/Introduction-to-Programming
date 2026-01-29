// Practical 2B- Question 3
// Oisin - L00172671
// 6.10.2022
// Program that will ask the user to enter the price of an item and the amount tendered. The program will then display the amount of change due.


import java.util.Scanner;
public class ChangeOwed
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variable to hold amount of item, amount tendered, change
      double price, tendered, change;
      
      //Assign vaule to price
      System.out.print("Enter the price of the item ");
    price = keyboardIn.nextDouble();
     
     //Assign value to tendered
     System.out.print("Enter amount tendered ");
     tendered = keyboardIn.nextDouble();
     
     //Assign vaule to change owed
     change = tendered - price;
     
     // Display vaule of change owed on screen
     System.out.print("Change due is " + change);
     
   }
}
     
     

