// Practical 2A - Question 3
// Oisin
// 4.10.2022
// Program that prompts a user to enter the radius of a circle.

import java.util.Scanner;
public class CalculateAreaOfACircle
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Assign variable to hold radius pi and area
      double radius, pi, area;
      
      //Display text whcih asks user to input radius
      System.out.print("Enter radius ");
      radius = keyboardIn.nextDouble();
      
      //Assign value to pi
      pi = 3.141592;
      
      //Assign value to area
      area = pi * radius * radius;
      
      // Display area on screen
      
      System.out.println("Area is " +area);
   }
}
   
   
      
      