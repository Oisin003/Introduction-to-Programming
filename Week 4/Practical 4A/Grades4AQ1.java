 // Practical 4A -Question 1
// Oisin - L00172671
// 18.10.2022
// Program to assign grades

import java.util.Scanner;
public class Grades4AQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int mark; 
      String grade;
            
                
      // Displat prompt on screen asking user to enter their mark
      System.out.print("Please enter your mark:");
      mark = keyboardIn.nextInt();
      
         //Assign values to marks
         if (mark >= 70)
         {
            grade = "Distinction";
         }
         
         else if (  mark >= 55)
         {
            grade = "Merit";
         }
        else if  (mark >= 40)
         {
            grade = "Pass";
         }
       else 
         {
            grade = "Fail";
         }
         
         
      //Display text on screen showing user their mark and grade
      System.out.println("Mark:" +mark);
      System.out.println("Grade:" +grade);
      
   } //end main method

} //end class


      
      
