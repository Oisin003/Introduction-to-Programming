// Practical 3B - Question 4
// Oisin - L00172671
// 13.10.2022
// Program to calculate expenses

import java.util.Scanner;
public class CalExpenses
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double expenses, mile, allowancePerMile, totalExpenses;
            
      //Display text asking the employee to enter the miles travelled
      System.out.print("Please enter miles travelled: ");
      mile = keyboardIn.nextDouble();
      //Display prompt asking the user to enter their allowance per mile
      System.out.println("Enter allowance per mile: ");
      allowancePerMile  = keyboardIn.nextDouble();
           
            expenses = (mile * allowancePerMile);
            
            
            if
            (mile > 150)
            {
               totalExpenses = (expenses + 100);
               System.out.print("The amount of expenses are: " +totalExpenses);
               }
               else
               {
               System.out.print("The amount of expense rewarded are: " + expenses);
               }
               
} //end main method

} //end class




     
     
     
     



      
