// Practical 8A - Question 8
// Oisin - L00172671
// 22.11.2011
// Program that will print the average age of students

import java.util.Scanner;
public class Average8AQ8
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
       //Declare variables
       int num, age = 0, average = 0;
        
       //Get user input 
       System.out.println("Please enter the number of students in the class");
       num = keyboardIn.nextInt();
       
      for(int count = 1; count <= num.; count++)
      {         
        //Display prompt
        System.out.println("Please enter student age:");
        age = keyboardIn.nextInt();
        average = age * count++ / num;          
      }//close 
         //Displaytext on screen
         System.out.println("Average" + average);
         
   }// end main method
}//end class
