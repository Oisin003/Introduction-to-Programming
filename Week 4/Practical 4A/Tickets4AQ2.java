// Practical 4A -Question 2
// Oisin - L00172671
// 18.10.2022
// Program to determine the cost of cinema tickets

import java.util.Scanner;
public class Tickets4AQ2
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int age;
      
      //Display prompt asking user to enter their age
      System.out.print("Please enter your age: ");
      age = keyboardIn.nextInt();
      
         if (age > 65)
         {
            System.out.print("4.40");
         }
         else if (age < 18)
         {
            System.out.print("5:00");
         }
         else if (age > 12)
         {
            System.out.print("Free");
         }
         else 
         {
            System.out.print("6:00");
         }      
           
       } //end main method

} //end class


      
