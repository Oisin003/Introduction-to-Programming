//Practical 11B - Question 5
//Oisin - L00172671
//16.12.2022
//Program to use an array to accept home and away scores of the last 6 soccer matches

import java.util.Scanner;

public class socres11BQ5
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
   Scanner keyboardIn = new Scanner(System.in);
   
    int [] awayGames = new int [6];
    
    int [] homeGames = new int [6];
       
       for(int i = 0, j = 0; i < awayGames.length || j < homeGames.length; i++ , j++)
         {//open for
         
            //Get user input
            System.out.println("Please enter the home score for match:" + (i+1));
            homeGames = keyboardIn.nextInt();
            //Get user input
            System.out.println("Please enter the away socre for match:" + (j+1));
            awayGames = keyboardIn.nextInt();
            
         }//close for
         
      }//close
   }//close
        

