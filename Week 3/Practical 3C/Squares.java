// Practical 3C - Question 5
// Oisin - L00172671
// 13.10.2022
// Program to teel the user if a shape is a square

import java.util.Scanner;
public class Squares
 {

   public static void main(String [] args)
   {
    Scanner keyboardIn = new Scanner(System.in);
    
    int height, width;
    
    //Display prompt on screen asking user to enter the height and width of a 2d shape
    System.out.print("Please enter a height:");
    height = keyboardIn.nextInt();
    System.out.print("Please enter a width:");
    width = keyboardIn.nextInt();
    
      if (height != width)
      {
      System.out.print("Your shape is not a square");
      }
      if (height == width)
      {
      System.out.print("Your shape is a square");
      }
      
   } //end main method

} //end class

    
    
