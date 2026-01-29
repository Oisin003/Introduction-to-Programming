// Practical 2B - Question 4
// Oisin - L00172671
// 6.10.2022
// Program to display discount

import java.util.Scanner;
public class Discounts
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variable to hold pro1 pro2 pro3 discount total
      double pro1, pro2, pro3, discount, total, gross, answer;
      
      //Assign value to pro1
      System.out.print("Enter price of the first product \t ");
     pro1 = keyboardIn.nextDouble();
     
     //assign value to pro2
     System.out.print("Enter the price of the second product \t ");
     pro2 = keyboardIn.nextDouble();
     
     //Assign value to pro3
     System.out.print("Enter the price of the second product \t  ");
     pro3 = keyboardIn.nextDouble();
     
     //Assign value to gross total
     gross = pro1 + pro2  + pro3;
     //Display gross total on screen 
     System.out.println("Gross total: \t " + gross);
     
     
     //Assign vaule to discount and display it on screen 
      discount = 0.1 ;
     System.out.println("Discount earned: " + discount);
         
     // perform cal to take discounte from gross amount
     total = discount * gross;
     
     //cal answer
     answer = gross - total;
     
         
     //Display total on screen
     System.out.println("Total amount due: \t " + answer);
     
     }
     
   }
     
