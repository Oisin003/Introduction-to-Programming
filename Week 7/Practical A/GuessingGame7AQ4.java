//Practical 7A - Question 4
// Oisin - L00172671
// 15.11.2022
// Program to create guessing game

import java.util.Scanner;
public class GuessingGame7AQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int number, guess;
            
            //Display weclome message
         System.out.println("Welcome to the guessing game !");

         
            //Display prompt asking the user to enter a guess
            System.out.println("Please enter your guess:");
            guess = keyboardIn.nextInt();
        
         
         //open
         while (guess > 7)
         {
            //Display message
            System.out.println("To high");
            //Display prompt asking user to enter a guess
            System.out.println("Please enter a guess");
            guess = keyboardIn.nextInt();
         }
         //close
         
         //open
         while (guess < 7)
         {  //Display message
            System.out.println("Too low");
            //Display prompt asking the user to enter a guess
            System.out.println("Please enter a guess");
            guess = keyboardIn.nextInt();
         }
         //close
                  
         //open 
         if(guess == 7)
         {
            System.out.println("Well Done!");
         }         
         //close 
         
          } //end main method

} //end class

         
            
         
      
