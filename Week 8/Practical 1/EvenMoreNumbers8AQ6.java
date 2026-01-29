// Practical 8A - Question 6
// Oisin - L00172671
// 22.11.2011
// Program that will print the sum of numbers between 1 and 100

import java.util.Scanner;
public class EvenMoreNumbers8AQ6
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
       //Declare variables
       int total = 0;
      //Open for
      for(int count = 1; count <= 100; count++)
      {
         //Peform CAL to get total
         total = total + count;
      }//close 
         //Displaytext on screen
         System.out.println("Total sum of the numbers between 1 and 100 is:" + total);
         
   }// end main method
}//end class
