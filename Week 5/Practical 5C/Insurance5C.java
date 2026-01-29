// Practical 5C 
// Oisin - L00172671
// 27.20.2022
// Program to determine insurance premium

import java.util.Scanner;
public class Insurance5C
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double age, carValue, miles, ppoints, sPremium, premium;
                 
      //Display text on screen asking the user to input their age 
      System.out.print("Please enter your age:");
      age = keyboardIn.nextDouble();
      //Display prompt asking user to enter the value of the car
      System.out.print("Please enter the value of your car:");
      carValue = keyboardIn.nextDouble();
      //Display prompt asking the total miles they drove in a year
      System.out.print("Please enter the total miles you drive in a year:");
      miles = keyboardIn.nextDouble();
      //Display prompt on screen asking the user to enter any penalty points
      System.out.print("Please enter any penalty points:");
      ppoints =keyboardIn.nextDouble();
      
      sPremium = carValue * 0.07;
      
         //Run if else statement and determine the premium 
         if ( age >= 25 )
         {
            //Display premium
            System.out.print( +sPremium);
         }
         else if ( miles > 15000)
         {
            //Peform cal
            premium = sPremium + 70;
            //Display Premium
            System.out.print( + premium);
         }
         else if ( age < 25 || carValue > 18000)
         {
            //Peform cal
            premium = sPremium + 120;
            //Display premium
            System.out.print( +premium);
         }
         else if (age > 30 && ppoints == 0)
         {
            //Peform cal
            premium = (sPremium * 0.4)- sPremium;
            //Display Premium
            System.out.print( + premium);
         }
         else if( age > 30 && ppoints <= 5)
         {
            //Peform cal
            premium = (sPremium * 0.1)- sPremium;
            //Display Premium
            System.out.print( + premium);
         }
         else if (ppoints > 8)
         {
            //Display text
            System.out.print("You will not be insured");
         }
         
   } //end main method

} //end class


      

