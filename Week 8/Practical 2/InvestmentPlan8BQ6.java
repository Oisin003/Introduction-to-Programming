// Practical 8B - Question 6
// Oisin - L00172671
// 24.11.2022
// Program to decide investment plan

import java.util.Scanner;
public class InvestmentPlan8BQ6
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double value, interest, percent;
      //Get user input
      System.out.println("Please enter a value:");
      value = keyboardIn.nextDouble();
      
      //Display message
      System.out.println("Plan A");
      for(double count = 0; count <= 30; count++)
      {//open
         //Peform Cal
         percent = value / 10;
         //Peform Cal
         interest = value * percent * count++;
         //Display Interest
         System.out.println("Simple Interst at the end of the year" + count + ":" + interest);
      }//close
      //Display message 
      System.out.println(" Plan B");
      for(double count = 0; count <= 30; count++)
      {//open
         //Peform Cal
         percent = value / 5;
         //Peform Cal
         interest = value * percent * count++;
         //Display Interest
         System.out.println("Compund interest at the end of the year" + count+ " :" + interest);
      }//close

         
      }//close
      }//close
         
         
      
      
