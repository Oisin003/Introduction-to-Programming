// Practical 8C - Question 1
// Oisin - L00172671
// 24.11.2022
// Program to calculate commission

import java.util.Scanner;
public class InvestmentPlan8CQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double house, value, totalValue, total; 
      //Get user input
      System.out.println("Enter the number of houses you have sold this month");
      house = keyboardIn.nextDouble();
      
      for(double count = 0; count <= house; count++)
      {//open
         System.out.println("Enter the value of each house");
         value = keyboardIn.nextDouble();
         //Peform Cal
         totalValue = value * house;
         
         }//close
         //Peform Cal
         total = totalValue;
         //Display text
         System.out.println("Total value of houses sold"+ total);
         }
         }
               
