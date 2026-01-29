//Practical 8B- Question 3
// Oisin - L00172671
//24.11.2022
//Program to peform  a count down

import java.util.Scanner;
public class PrintNumbers8BQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
       
      //Open for
      for(int count = 10; count >= 1; count--)
      {
         //Display text 
         System.out.println(count + "  ");
      }//close 
      
      //Display message
      System.out.println("Blast off!!!");
   }// end main method
}//end class
