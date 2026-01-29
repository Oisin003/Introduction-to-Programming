// Practical 4B - Question 1
// Oisin - L00172671
// 20.10.2022
// Program ot display exam marks

import java.util.Scanner;
public class Marks4BQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
   double mark;
      
      //Display prompt asking user to enter their mark
      System.out.print("Please enter your exam mark");
      mark = keyboardIn.nextDouble();
      
         //Display marking scheme on screen
         if(mark < 0 || mark > 100 )
         {
            System.out.print("Error");
         }
         else if(mark > 40)
         {
            System.out.print("You have passed");
         }
         else
         {
            System.out.print("You have failed");
        }
        
      } //end main method

} //end class

 
