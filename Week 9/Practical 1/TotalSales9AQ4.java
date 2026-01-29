// Practical 9A - Question 4
// Oisin - L00172671
// 29.11.2011
//Program to rework given code 

import java.util.Scanner;
public class TotalSales9AQ4
{
   public static void main(String[ ] args)
   {

// declare variables
 Scanner keyboardIn = new Scanner(System.in);
 
 double quarterlySales = 0;
 double totalSales = 0;

for(int quarter = 1; quarter <= 4; quarter++)
{//open for
 
  //Get user input
 System.out.print("Enter quarterly sales for quarter " + quarter);
 quarterlySales = keyboardIn.nextDouble();
 //Peform Cal
 totalSales = totalSales + quarterlySales;
 
 


 }//close for
    
       //Display total sales
   System.out.println("Total sales for the year: " + totalSales);

 }// end main method
}//end class
