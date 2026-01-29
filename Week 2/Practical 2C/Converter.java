// Practical 2C - Question 1
// Oisin - L00172671
// Program to convert euro to pound
// 6.10.2022

import java.util.Scanner;
public class Converter
{
   public static void main(String[ ] args)
   {
   Scanner keyboardIn = new Scanner(System.in);
   double euro, pound,answer;
   
   //Assign vaule to euro and display prompt asking user to enter an amount in euro
   System.out.print("Enter amount in euro:\t ");
   euro = keyboardIn.nextDouble();
   
   //Assign value to pound 
   pound = 0.90;
   
   //Assign value to answer
   answer = euro * pound;
  
   //display answer on screen
   System.out.print(euro + "\t euro is equal to\t" + answer + "\tpounds");
   
   }
}
    
    
