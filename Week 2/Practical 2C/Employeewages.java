// Practical 2C - Question 4
// Oisin -L00172671
// 6.10.2022
// Program to work out employe wages

import java.util.Scanner;
public class Employeewages
{
   public static void main(String[ ] args)
   {
   Scanner keyboardIn = new Scanner(System.in);
   
   //Declare variable to hold rate, hours, answer
   int rate, hours, answer;
   
   //Assign value to hours and display on screen
   System.out.print("Please enter the total number of hours worked this week:\t");
   hours = keyboardIn.nextInt();
   
   //Assign value to rate
   rate = 11;
   
   //peform cal to work out total wage
   answer = hours * rate;
   
   //Display total take home pay on screen
   System.out.println("Total wage based on hours worked at a rate of €11 an hour is:\t " +answer);
   
   }
}
