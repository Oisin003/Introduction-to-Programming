// Practical 2A - Question 6
// Oisin
// 4.10.2022
// Program that prompts a user to enter their first and second initials

import java.util.Scanner;
public class Initials
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable to hold init1 and init2
      char init1, init2;
      
      //Display text to prompt user to enter their first initial 
      System.out.print("Please enter your first initial ");
      init1 = keyboardIn.next().charAt(0);
      
      //Display text to prompt user to enter their second initial
      System.out.print("Please enter your second initial ");
      init2 = keyboardIn.next().charAt(0);
      
      //Display text whcih reeads your initials
      System.out.print("Your initials are " +init1 +init2);
      
   }
}
      