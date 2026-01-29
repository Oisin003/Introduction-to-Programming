// Practical 5B- Question 3
// Oisin  - L00172671
// 27.10.2022
// Program to determine the value of a discount

import java.util.Scanner;
public class Discount5BQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int code, amount;
      
      //Display prompt asking the user to enter the product code and the amoun
      System.out.print("Please enter the product code (1-5):");
      code = keyboardIn.nextInt();
      System.out.print("Please enter the amount sold:");
      amount = keyboardIn.nextInt();
      
      //Run switch statement and display the discount on screen
     switch(code)

      {//open switch
               case 1:
             System.out.print("5%");
             break;
         case 2:
            System.out.print("20%");
            break;
         case 3:
            System.out.print("10%");
            break;
         case 4:
            System.out.print("5%");
            break;
         default: System.out.print("Invalid");
           }//end switch
         } //end main method

} //end class

               
         
         
         