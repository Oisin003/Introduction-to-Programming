// Practical 5B- Question 4
// Oisin - L00172671
// 27.10.2022
// Program to display temp.

import java.util.Scanner;
public class Temp5BQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
     double temp;
      
      //Display text asking the user to enter the temp
      System.out.print("Please enter the temp: ");
      temp = keyboardIn.nextDouble();
      
      if (temp <= 0)
      {
      System.out.print("Freezing");
      }
      
      else if (temp >= 1 && temp < 9)
      {
      System.out.print("Cold");
      }
      
      else if (temp >= 9 && temp <= 16)
      {
      System.out.print("Moderate");
      }
      
       else    
       {
       System.out.print("Warm");
       }
      
      } //end main method

} //end class


     
     
