// Practical 3A- Question 2
// Oisin - L00172671
// 11.10.2022
// Program to grade exams

import java.util.Scanner;
public class ExamMarks
{

   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Assign value to pass mark
      double mark = 40;
      
      //Display prompt which asks user to enter their mark
      System.out.print("Please enter your mark");
      mark = keyboardIn.nextDouble();
      
      //Assign if variable to pass  mark
      if ( mark > 40)
      {
      System.out.print("Pass ");
      }
      //Assign variable to fail mark
      if (mark < 40)
      {
      System.out.print("Fail \t");
      }
              
   } //end main method

} //end class
