// Practical 2C - Question 2
// Oisin - L00172671
// Program to convert euro to pound
// 6.10.2022

import java.util.Scanner;
public class Discounts2
{
   public static void main(String[ ] args)
   {
   Scanner keyboardIn = new Scanner(System.in);
   
   //Assign variable to hold price, fprice, discount, total
   double price, discount, fprice, total;
  
  //Assign variable to hold product 
   char product;
   
   //Assign value to product and display prompt which asks user to enter product name
   System.out.print("Please enter product name:\t ");
   product = keyboardIn.next().charAt(0);
   
   //Assign value to price and enter prompt which asks user to enter product price
   System.out.print("Please enter product price:\t ");
   price = keyboardIn.nextDouble();
   
   //Display price of product on screen
   System.out.println( product + " original price \t" + price);
   
   //Assign value to discount
   discount = 0.2;
   //Display discount on screen
   System.out.println("Discount 20.0");
   
   //assign value to total
   total = discount * price;
   
   //peform cal to determine fprice
   fprice = price - total;
   
   //Display final price on screen
   System.out.print("Final price \t" +fprice);
   
   }
}
