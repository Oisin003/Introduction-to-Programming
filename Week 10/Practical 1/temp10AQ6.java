//Practical 10A - Question 6
//Oisin - L00172671
//7.12.2022
//Program that will store and print the average temp of 7 days

import java.util.Scanner;
public class temp10AQ6
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     
      double[] temps = new double[7];
      
      //declare variables 
      double average=0;

      //Get daily temperatures for the week
            System.out.println("Enter temperature: ");
            for(int i = 0; i< temps.length; i++)
               {//open
                  System.out.print("Day " +(i+1)+": ");
                  temps[i] = keyboardIn.nextDouble();
               }//close
            
            for(int i = 0; i< temps.length; i++)
               {//open
                  //Peform Cal
                  average =(temps[0] + temps[2]+ temps[3]+temps[4]+temps[5]+temps[6])/7;
                 
               }//close  
               //Display average temp
                  System.out.println("Average daily temp:"+ average);
             
               }//close
               
               }//close