// Practical 7A - Question 1
// Oisin - L00172671
// 15.11.2022
// Program to to write pstive numbers

import java.util.Scanner;
public class PostiveNumbers7AQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int number;
      
         //open do statement
         do{
            //Display prompt asking user to enter a postive number
            System.out.print("Please enter a postive number");
            number = keyboardIn.nextInt( );
         }while (number <= 0);  //while num is negative
         
       } //end main method

} //end class


      
