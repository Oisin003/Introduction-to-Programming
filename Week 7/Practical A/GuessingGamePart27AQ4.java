// Practical 7A - Q5
// Oisin - L00172671
// 15.11.202
// Program to to create guessing game

import java.util.Scanner;
public class GuessingGamePart27AQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int number, guess;
      
     //Display message 
     System.out.println("Welcome to the guessing game");
     System.out.println("Enter a number between 1 -10");
           
           do{//open
            //Display prompt
            System.out.println("Enter a guess");
            number = keyboardIn.nextInt();
            
            if(number < 7)
            {
               //display message
               System.out.println("Too low");
            }
            else if (number > 7)
            {
               //Display message
               System.out.println("Too low");
            }
            else
            {
         System.out.println("Well done");
      }
      }while(number !=7);//close
}
}        
        
        
        
        
        
        
        
        
        
        
     