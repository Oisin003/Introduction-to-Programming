//Practical 11A - Question 6
//Oisin - L00172671
//13.12.2022
//Program to adapt Question 6 so it will use a sesonc array to store the names of the months

import java.util.Scanner;

public class adaptedRainFall11AQ6
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
     Scanner keyboardIn = new Scanner(System.in);
     
     //Declare variables
     int under60 = 0, over70 = 0;

      
     int [] rainFall = new int [] {55, 91, 49, 94, 19, 21, 31, 83, 68, 72, 92, 44};
     String [] months = new String {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
     for(int i = 0; i < rainFall.length; i++)
     {//open for
     
      if(rainFall[i] < 60)
      {//Open if
         
         ++under60;
         
      }//close if
      
         else if(rainFall[i] > 70)
         {//open else if
         
            ++over70;
            
         }//close lese if
      }//close for
         
            //Display text to screen
            System.out.println("Number of months where rainfall was less that 60mm:" + under60);
            //Display text to screen
            System.out.println("Number of months where rainfall was greater than 70mm:" + over70);
           
            
         }//close
         
      }//close
     

