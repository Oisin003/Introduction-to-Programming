// Practical 3C - Question 1
// Oisin - L00172671
// 13.10.2022
// Program to determine qualification for the pension

import java.util.Scanner;
public class Pension
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int age;
      
      //Display prompt on screen which asks user to enter their age
      System.out.println("Please enter your age: ");
      age = keyboardIn.nextInt();
      
      if (age >= 65)
      {
      //Display text on screen telling the user if the qualify
      System.out.println("You qualify for the pension");
      }
      
      else
      {
      //Display text on screen telling user if they qualify
      System.out.println("You do not qualify for the pension");
      }
      
     } //end main method

} //end class


      
