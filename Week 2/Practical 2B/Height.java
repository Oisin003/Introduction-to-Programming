// Practical 2B - Question 5
// Oisin - L00172671
// 6.10.2022
// Program to display height in feet and inches

import java.util.Scanner;
public class Height
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variable to hold hinches, hfeet, height
      int height, inches, feet;
      
      //Assign value to hinches
      System.out.print("Enter your height in inches \t ");
     height = keyboardIn.nextInt();
     
     //Assign vaules
     feet = height / 12;
     inches = height % 12;
     
     System.out.println("Height in ft and inches:\t " + feet  + "ft \t"+ inches + "inches");
     
          
                  }
   }