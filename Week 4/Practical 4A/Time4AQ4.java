// Practical 4A - Question 4
// Oisin - L00172671
// 18.10.2022
// Program to display time in am or pm

import java.util.Scanner;
public class Time4AQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double time;
      
      //Display prompt on screen asking user to enter the time
      System.out.print("Please enter the time in 24 hour format: ");
      time = keyboardIn.nextDouble();
      
      if (time > 0 && time <= 12)
      {
         System.out.print("The time is" +time + "am");
      }
      else if (time > 12 && time <= 24)
      {
         System.out.print("The time is" +time + "pm");
      }
      else 
      {
         System.out.print("Error invalid time entered");
      }
      
   } //end main method

} //end class

 
      
      
      
      
