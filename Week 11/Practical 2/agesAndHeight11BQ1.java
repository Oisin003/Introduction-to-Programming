//Practical 11B - Question  1
//Oisin - L00172671
//14.12.2022
//Program to store names and height of 5 students

/*
Get students names
Get students height
Store names
Store heights
Print out students who are above 1.6 metres
*/

import java.util.Scanner;

public class agesAndHeight11BQ1
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
   Scanner keyboardIn = new Scanner(System.in);
   
      // declare an array to hold ten prices
      double[] heights = new double[5];
      String[] studentName = new String[5];
      

      
      
      for(int i=0; i < heights.length; i++)
      {//open for
      
         // read in student heights
         System.out.println("Enter height no." + (i+1) + ":");
         heights[i] = keyboardIn.nextDouble();
                           
         
       }//Close for
       
       //Create balnk space
       System.out.println("");
 
       
         for(int j=0; j < studentName.length; j++)
         {//open for
      
            // read in names for each students
            System.out.println("Enter the name of student no." + (j+1) + ":");
            studentName[j] = keyboardIn.nextLine();
            
          }//Close for
          
          for(int i=0; i < heights.length; i++)
            {//open for
             if(i<1.6)
             {//open if
               //Display text to screen
               System.out.println(studentName[i] + ":" + heights[i]);
               }//close if
               
            }//close for

                    
                
     } //Close
     
   } // end class
      