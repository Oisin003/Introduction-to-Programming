// Practical 4C -Question 3
// Oisin - L00172671
// 20.10.2022
// Program to validate triangle

import java.util.Scanner;
public class Triangles4CQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double side1, side2, side3;
      
      //Display prompt asking user to enter values for the 3 sides of the triangle
      System.out.println("Please enter the value of side 1:");
      side1 =  keyboardIn.nextDouble();
      System.out.println("Please enter the value of side 2:");
      side2 =  keyboardIn.nextDouble();
      System.out.println("Please enter the value of side 3:");
      side3 =  keyboardIn.nextDouble();
      
      //Peform cal and display answer on screen
        if(side1 + side2 > side3)
         {
            System.out.print("Triangle");
         }
         else if(side1 + side3 > side2)
         {
            System.out.print("Triangle");
         }
        else if(side3 + side2 > side1)
         {
            System.out.print("Triangle");
         }
         else
         {
            System.out.print("Triangle");
         }
      } //end main method

} //end class





