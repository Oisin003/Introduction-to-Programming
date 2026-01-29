//Practical 8B - Question 4
//Oisin - L00172671
//24.11.2022
//Program to display the daily average temp

import java.util.Scanner;
public class Temp8BQ4
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);      
      int num, day, total = 0;
      double average;
      System.out.print("Please enter the number the number of days ");
      day = keyboardIn.nextInt();
      //repeat n times
      for(int count = 1; count <= 7; count++)
      {
      System.out.print("Enter value " +count +": " );
      num = keyboardIn.nextInt();
      //add num to total
      total = total + num;
      }
      //calc average
      average = total/day;
      //display average
      System.out.println("Average is " +average);
   } //end main method
   } //end class
         