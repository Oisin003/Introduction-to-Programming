//Practical 7B - Question 5
// Oisin - L00172671
//18.11.2022
//Program to count letters

import java.util.Scanner;

public class letters7BQ5
{
   public static void main(String[ ] args)
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      char letter;
      int num, countV=0, countC=0;
      
      Scanner scan = new Scanner(System.in);
      //Prompt user
      System.out.println("Enter 5 numbers: ");
      for(char i=0; i<5; i++)
      {
         num = scan.nextInt();
         if(letter != 'A' || letter != 'a' || letter != 'E' || letter != 'e' || letter != 'I' || letter != 'i' || letter != 'O' || letter != 'o' || letter != 'U' || letter != 'u')
            countC++;
         else if(letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u');
            countV++;
      }
      
      System.out.println("\nTotal Vowels: " +countV);
      System.out.println("Total Constants: " +countC);
   }
}