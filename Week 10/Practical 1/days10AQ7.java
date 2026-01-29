//Practical 10A - Question 7
//Oisin - L00172671
//7.12.2022
//Program that will store and print the days of the week

import java.util.Scanner;
public class days10AQ7
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     
     String daysOfWeek [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
     
      for(int i = 0; i < daysOfWeek.length; i++)
      {//open for
      
         //Print days of the week in order
         System.out.println(daysOfWeek[i]);
         
      }//close for
      
      //Create blank space
      System.out.println("");
      for(int j =  daysOfWeek.length -1; j >=0; j--)
      {//open for
         
         //Print days of the week backwards
         System.out.println(daysOfWeek[j]);
         
      }//close for
      

      
      }//close
      }//close
     
