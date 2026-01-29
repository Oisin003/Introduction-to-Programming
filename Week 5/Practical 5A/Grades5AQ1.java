// Practial 5A - Question 1
// Oisin - L00172671
// 25.10.2022
// Program to grade students

import java.util.Scanner;
public class Grades5AQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      char grade;
      //Display prompt asking user to enter a grade
      System.out.print("Please enter your grade:");
      grade = keyboardIn.next().charAt(0);
         
         //Display grading system on screen 
         switch(grade)
         {  
               case 'A':
               case 'a':
                  System.out.print("Excellent student");
                  break;
               case 'B':
               case 'b':
                  System.out.print("Good student");
                  break;
               case 'C': case 'c':
               case 'D': case 'd':
                  System.out.print("Fair student");
                  break;
               case 'E': case 'e':
               case 'F': case 'f':
                  System.out.print("Poor student");
                  break;
               default: System.out.print("Invalid grade");
            }//end switch
             
    } //end main method

} //end class



