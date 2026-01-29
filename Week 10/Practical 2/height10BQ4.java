//Practical 10B -Question 4
//Oisin - L00172671
//7.12.2022
//Program declare heights

import java.util.Scanner;
public class height10BQ4
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     
     //Declare variables
     int noPeople = 0;
     
     //Get user input
     System.out.println("How many people are there");
     noPeople = keyboardIn.nextInt();
     
     double [] heights = new double [noPeople];
     
      for(int i = 0; i < heights.length; i++)
      {//open for
         //Get user input
         System.out.println("Please enter height of person" + (i+1));
         heights[i] = keyboardIn.nextDouble();
      }//close for
      
       for(int i = 0; i < heights.length; i++)
      {//open for
         //Get user input
         System.out.println("Height of perosn"+ (i+1)+ ":" + heights[i]);
      }//close for
      
   }
}
      

            
