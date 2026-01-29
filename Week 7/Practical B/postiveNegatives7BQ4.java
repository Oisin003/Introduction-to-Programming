//Practical 7B - Question4
//Oisin - L00172671
//17.11.2022
//Program to count and display numbers

//P.S. struggled to get this program to work so did get help from the internet
//https://codescracker.com/java/program/java-program-count-positive-negative-zero.htm

import java.util.Scanner;

public class postiveNegatives7BQ4
{
   public static void main(String[ ] args)
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      int coinToss, countP=0, countN=0;
      
      Scanner scan = new Scanner(System.in);
      //Prompt user
      System.out.println("Enter 10 Numbers: ");
      for(int i=0; i<10; i++)
      {    
      coinToss = scan.next().charAt(0);   
       if(coinToss == 'H' || coinToss =='h')
            countN++;
         else if(coinToss == 'T' || coinToss =='t')
            countP++;
      }
      
      System.out.println("\nTotal Positive Number: " +countP);
      System.out.println("Total Negative Number: " +countN);
   }
}