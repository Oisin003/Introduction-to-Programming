// Practical 2B -Question 2
// Oisin -L00172672
// 4.10.2022
// Program to find voule of a cylinder

import java.util.Scanner;
public class VolumeOfACylinder
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable to hold radius, height, volume 
      double radius, height, volume;
            
      //assign value to radius
      System.out.print("Enter radius ");
      radius = keyboardIn.nextDouble();
      
      //Assign value to height
      System.out.print("Enter height ");
      height = keyboardIn.nextDouble();
      
      //Assign variable to hold pi
   double pi;
      //Assign value to pi
      pi = 3.141592;
      
      //Perform cal to determin volume
      volume = pi * radius * radius * height;
      
      
     //Display volume on screen
     System.out.print("Volume: "+volume);
      }
   }