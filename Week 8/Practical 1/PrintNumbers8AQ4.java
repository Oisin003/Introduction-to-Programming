// Practical 8A - Question 4
// Oisin - L00172671
//22.11.2011
// Program that will print 1  10 in reverse

import java.util.Scanner;
public class PrintNumbers8AQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
       
      //Open for
      for(int count = 10; count >= 1; count--)
      {
         //Display text 
         System.out.print(count + "  ");
      }//close 
   }// end main method
}//end class
