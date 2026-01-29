// Practical 2B - Question 6
// Oisin - L00172671
// 6.10.2022
// Program to display Full name on screen

import java.util.Scanner;
public class FullName
{
   public static void main(String[ ] args)
   {
   Scanner keyboardIn = new Scanner(System.in);
   string  fName, sName;
   
   //Display first name on page
   System.out.print("Enter your first name: ");
   fName = keyboardIn.nextLine();
   
   //Display second name on page
   System.out.print("Enter your second name: ");
   sName = keyboardIn.nextLine();
   
   //Display full name on page
   System.out.println("Hello " +fName +" " +sName );
   }
}