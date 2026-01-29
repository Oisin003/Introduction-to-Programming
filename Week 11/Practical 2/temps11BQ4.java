//Practical 11B -Question 4
//Oisin - L00172671
//15.11.2022
//Program to store the temperature of the days of the week

import java.util.Scanner;

public class temps11BQ4
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
   Scanner keyboardIn = new Scanner(System.in);
   
   String [] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
   
   double [] temp = new double[7];
   
      for(int i = 0, j = 0; i < days.length || j < temp.length; i++, j++)
      {//Open for
      
         //Get user input
         System.out.println("Please enter the temp for day " + (j+1) + ":");
         temp[i] = keyboardIn.nextDouble();
         
      }//close for
      
      //Create blank space
      System.out.println("");
      
      for(int i = 0, j = 0; i < days.length || j < temp.length; i++, j++)
      {//Open for
      
         //Display text to screen
         System.out.println(days[i] + ":" + temp[j]);
         
      }//close for

      
      }//close
   }//close
