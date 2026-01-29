//Practical 8A -Question 9
//Oisin - L00172671
//24.11.2022
//Program display square and cubes from 1 up to a specified number

import java.util.Scanner;
public class Squares8AQ9
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int num, square;
      
      //Display prompt
      System.out.println("Please enter a number");
      num = keyboardIn.nextInt();
      
      for(int count = 1; count <= num; count++)
      //open for
      {
         //Display number
         System.out.println(count++);
         //Peform cal to get square
         //square = count++ * count++;
         //Display count
         //System.out.println(+square);
      }// close for 
      }
      }
      
      
