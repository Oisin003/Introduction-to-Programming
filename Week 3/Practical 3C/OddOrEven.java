// Practical 3C - Question 6
// Oisin - L00172671
// 13.10.2022
// Program to tell user if a number is odd or even

import java.util.Scanner;
public class OddOrEven
 {

   public static void main(String [] args)
   {
    Scanner keyboardIn = new Scanner(System.in);

      int num1, answer;
      
      //Display prompt on screen asking user to enter a numder
      System.out.print("Please enter a number:");
      num1 = keyboardIn.nextInt();
      
      //Pefrom cal to determine if the number is odd or even
      answer= num1%2;
            
            
         if (answer == 0)
         {
         //Display text on screen telling the user their number is even
         System.out.print("Your number is even");
         }
         
         else
         {
         //Display text on screen telling the user their number is odd
         System.out.print("Your number is odd");
         }
         
      } //end main method

} //end class

    

         
