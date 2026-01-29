//Practical 11A -Question 3
//Oisin - L00172671
//13.12.2022
//Progrm to read temp for each day and work oput the average

import java.util.Scanner;

public class dailyTemp11AQ3
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
     Scanner keyboardIn = new Scanner(System.in);
     
     //Declare variables
      double[] dailyTemp = new double[7];
      
      double input, average = 0;
      
           for(int i = 0; i < dailyTemp.length; i++)
            {//open for
            
               //Get user input
               System.out.println("Enter the temperature for day:" + (i+1));
               dailyTemp[i] = keyboardIn.nextDouble();
               
            }//close for
            
            
            
            //Peform Cal to get average
            average = (dailyTemp[0] + dailyTemp[1] + dailyTemp[2] + dailyTemp[3] + dailyTemp[4] + dailyTemp[5] + dailyTemp[6]) / 7;
            //Display average daily temp
            System.out.println("Average temp for noon each day:" +average);
            
            }//close
         }//close







