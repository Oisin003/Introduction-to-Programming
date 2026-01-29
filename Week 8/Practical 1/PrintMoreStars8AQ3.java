// Practical 8A - Question 3
// Oisin - L00172671
//22.11.2011
// Program that will print n number of stars

import java.util.Scanner;
public class PrintMoreStars8AQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      int value;
      //Get user input
      System.out.println("Please enter a value");
      value = keyboardIn.nextInt();           
      //Open for
      for(int count = 0; count <= value; count++)
      {
         //Display text 
         System.out.print( " * ");
      }//close 
   }// end main method
}//end class
