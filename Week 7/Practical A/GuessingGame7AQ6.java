// Practical 7A - Question 6
// Oisin - L00172671
// 17.11.2022
// Program to adapt guessing game

import java.util.Scanner;

public class GuessingGame7AQ6
{
   public static void main(String[ ] args)
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int guess, numGuess,guessNum, number = 7;
          //display Weclome message
             System.out.println("Welcome to the guessing game");
             //Display prompt asking the user to enter a guess
             System.out.println("Please enter a guess:");
             guess = keyboardIn.nextInt();

           do{
             if(guess == 7)
             {//Open if
               //Disply message
               System.out.println("Well done");
               
               
             }//close if
             
             if(guess > 7)
             {//open
               //Display message
               System.out.println("Too high");
               //Dislay prompt
               System.out.println("Please guess again");
               guess = keyboardIn.nextInt();
             }
             //close
             
             if (guess < 7)
             {//open
               //Display message
               System.out.println("Too low");
               //Display prompt
               System.out.println("Guess again");
               guess = keyboardIn.nextInt();
              }//close
            }while(guess < 11);//close
            
           } //end main method

} //end class

         
            
         
