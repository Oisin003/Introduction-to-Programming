//Practical 10B -Question 3
//Oisin - L00172671
//7.12.2022
//Program declare heights

import java.util.Scanner;
public class names10BQ3
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     
     //Declare variables
     int noPeople = 0;
     
     //Get user input
     System.out.println("How many people are there");
     noPeople = keyboardIn.nextInt();
     
     char [] names = new char [noPeople];
     
      for(int i = 0; i < names.length; i++)
      {//open for
         //Get user input
         System.out.println("Please enter the name of person" + (i+1));
         names[i] = keyboardIn.next().charAt(0);
      }//close for
      
       for(int i = 0; i < names.length; i++)
      {//open for
         //Get user input
         System.out.println("Name of perosn"+ (i+1)+ ":" + names[i]);
      }//close for
      
   }
}
      

            
