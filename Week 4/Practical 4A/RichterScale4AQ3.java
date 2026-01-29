// Practical 4A - Question 3
// Oisin - L00172671
// 18.10.2022
// Program to display effects of an earthquake

import java.util.Scanner;
public class RichterScale4AQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double richterScale, effect;
      
      //Display prompt on screen asking user to enter the richterScale
      System.out.println("Please enter the Richter Scale value of the earthquake: ");
      richterScale = keyboardIn.nextDouble();
      
         //Display richter scale on screen
         if(richterScale >= 7.9)
         {
            System.out.print("Most buildings are destroyed");
         }
         else if (richterScale  =< 7.0)
         {
            System.out.print("Well-built buildings are damaged");
         }
         else if (richterScale =< 6.9)
         {
            System.out.print("Chimmeys tumble, some buildings are destroyed");
         }
         else if (richterScale =< 5.9)
         {
            System.out.print("Walls crack; poorly built buildings are destroyed");
         }
         else if (richterScale =< 4.9)
         {
            System.out.print("Windows shake");
         }
         else
         {
            System.out.print("little");
         }
      
    } //end main method

} //end class

