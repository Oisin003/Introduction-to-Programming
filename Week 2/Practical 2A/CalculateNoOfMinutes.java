// Practical 2A - Question 4
// Oisin
// 4.10.2022
// Program that prompts a user to enter a number of hour and will output the number of minutes

import java.util.Scanner;
public class CalculateNoOfMinutes
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Assign variable to hold hours and mins
      double hours, min, answer ;
      
      //display text which prompts user to enter num of hours
      System.out.println("Enter number of hours: ");
      
      //Assign value to hours
      hours = keyboardIn.nextDouble();
      
     //Assign value to mins
     min = 60;
     
     //peform cal
     answer = min / hours;
    
    //Display answer on screen
    System.out.println("Number of minutes: " + answer);
    
    }
    
   }
    
     
     
      