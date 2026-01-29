// Practical 3C - Question 3
// Oisin - L00172671
// 13.10.1022
// Program to find positive difference between 2 numbers

import java.util.Scanner;
public class Differences
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
          int num1, num2, answer;
         
         //Display text on screen prompting user to enter 2 numbers
         System.out.println("Please enter the first number:");
         num1 = keyboardIn.nextInt();
         System.out.println("Please neter the second number:");
         num2 = keyboardIn.nextInt();
         //Pefrom cal to get answer
         answer = num1 - num2;
         
                      
            if (answer > 0 )
            {
            System.out.print(+ answer);
            }
            
         } //end main method

} //end class


            
            

