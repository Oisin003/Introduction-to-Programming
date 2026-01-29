// Practical 2B - Question 3
// Oisin - L00172671
// 6.10.2022
// Program to display your age in 2025

import java.util.Scanner;
public class Namein2025
{
   public static void main(String[ ] args)
   {
   Scanner keyboardIn = new Scanner(System.in);
  
  //Declare variable to hold age year and answer
   int age, year, answer, daysinayear, newage;
  
  char name;
     
   //Assign value to name and display prompt on screen asking user to enter their name
   System.out.print("What is your name?");
   name = keyboardIn.next().charAt(0);
   
   //Assign value to age and enter prompt on screen which asks user to enter their age
   System.out.println("What is your age?");
   age = keyboardIn.nextInt();
   
   //Assign value to year and enter prompt which asks user to enter the current year
   System.out.println("What year is it?");
   year = keyboardIn.nextInt();
   
    
   //Perform cal 
   answer = 2050 - year;
   
   newage = age + answer;
   
   //Display age in 2050
   System.out.print("Hi" +name +" in the year 2050 you will be" + newage);
   }
}      

