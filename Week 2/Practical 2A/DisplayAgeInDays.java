// Practical 2A - Question 2
// Oisin
// 4.10.2022
// Program that propts user to input their age in yers and displays the age in days

import java.util.Scanner;
public class DisplayAgeInDays
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int ageInYears, numOfDaysInAYear, ageInDays;
      // Display text on screen
      System.out.print("Enter your age: ");
      ageInYears = keyboardIn.nextInt();
      
      //Assign value to numOfDaysInAYear
      numOfDaysInAYear = 365;
      
      //pefrom cal to determin ageInDays
      
      ageInDays = ageInYears * numOfDaysInAYear ;
      
      // Display answer on screen
      
      System.out.println("Your age in days is " + ageInDays);
   }
}
   
   