// Practical 7B - Question 3
// Oisin - L00172671
// 17.11.2022
// Program that will ask the user to enter a number

import java.util.Scanner;

public class Numbers7BQ3
{
   public static void main(String[ ] args)
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      
     //Declare variables
        int number, totalValue, guess;
        //Assign value to variables
        totalValue = 0;
        number = 1;
        guess = 0;
        
        while(number != 0)
        {//open
         //GET user input
          System.out.println("Please enter a number");
          number = keyboardIn.nextInt();
          totalValue = number + totalValue;
          ++guess;
         }//close
         
            //Display message
            System.out.println("Number of values entered:" + totalValue);
            //Display message
            System.out.println("Total guesses:"+guess);
            
         }
      }
