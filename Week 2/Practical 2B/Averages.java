// Practical 2B - Question 1
// Oisin - L00172671
// 4.10.2022
// Program which will display average of of given values

import java.util.Scanner;
public class Averages
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variable to hold num1 num2 num3 average
      double num1, num2, num3, average;
      
      //Assign value to num1
      System.out.print("Enter first value ");
     num1 = keyboardIn.nextDouble();
     
     //assign value to num2
     System.out.print("Enter second value ");
     num2 = keyboardIn.nextDouble();
     
     //Assign value to num3
     System.out.print("Enter third value ");
     num3 = keyboardIn.nextDouble();
     
     //Assign value to average
     average = (num1 + num2 + num3)/3;
     
     //display average on screen 
     System.out.print("Average: " +average);
     
     }
   }
     
