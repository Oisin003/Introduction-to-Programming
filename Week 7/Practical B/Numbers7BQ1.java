// Practical 7B - Question 1
// Oisin - L00172671
// 17.11.2022
// Program that will ask the user to enter a number

import java.util.Scanner;

public class Numbers7BQ1
{
   public static void main(String[ ] args)
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int number;
      
         //Display Prompt on screen
         System.out.println("Please eneter a number:");
         number = keyboardIn.nextInt();
         
            //open
            while (number != 0 )
            {  //Display prompt on screen
               System.out.println("Please enter a number:");
               number = keyboardIn.nextInt();
            }//close
            
            if (number == 0)
            {  //Display message
               System.out.println("Well done !");
            }
            
            //Display message 
            System.out.println("You guessed the correct number:" + number);
           
           } //end main method

} //end class
            
