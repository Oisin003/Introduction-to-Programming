// Practical 4B - Question 4
// Oisin - L00172671
// 20.10.2022
// Adapt Martial status program

import java.util.Scanner;
public class Income4BQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);      
      char mStatus;
      double grossIncome;
      
      //Display prompt asking useer to enter their martial status
      System.out.print("Please enter your martial status, M for married or S for single:");
      mStatus = keyboardIn.next().charAt(0);
      
      //Display prompt asking user to enter their gross income
      System.out.print("Please enter your gross income:");
      grossIncome = keyboardIn.nextDouble();
         
         if(mStatus != 'M' && mStatus != 'S')
         {
            System.out.print("Error");
         }
         else if (mStatus == 'S' && grossIncome < 20000)
         {
            System.out.print("Your tax band is A");
         }
         else if (mStatus == 'M' && grossIncome < 20000)
         {
            System.out.print("Your tax band is B");
         }
         else if (mStatus ==  'S' && grossIncome > 20000)
         {
            System.out.print("Your tax band is C");
         }
         else if (mStatus == 'M' && grossIncome > 20000) 
         {
            System.out.print("Your tax band is D");
         }
         
       } //end main method

} //end class


     
      

