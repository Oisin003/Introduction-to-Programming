// Practical 7A - Q3
// Oisin - L00172671
// 15.11.2022
// Program to display lotto numbers

import java.util.Scanner;
public class LottoNumbers7AQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables 
      int num1, num2, num3;
      char close;
               
            //Display prompt asking the user to enter a number
            System.out.println("Please enter your first number:");
            num1 = keyboardIn.nextInt();
            //Display prompt asking the user to enter a second number
            System.out.println("Please enter your second number:");
            num2 = keyboardIn.nextInt();
            //Display prompt asking the user to enter a third number
            System.out.println("Please enter your third number:");
            num3 = keyboardIn.nextInt();
            //Display prompt asking the user if they want to change the number
            System.out.println("Do you want to keep your numbers:");
            close = keyboardIn.next().charAt(0);
         //while response is no
          while(close =='Y' || close == 'y')
         {
            //Display prompt asking the user to enter a number
            System.out.println("Please enter your first number:");
            num1 = keyboardIn.nextInt();
            //Display prompt asking the user to enter a second number
            System.out.println("Please enter your second number:");
            num2 = keyboardIn.nextInt();
            //Display prompt asking the user to enter a third number
            System.out.println("Please enter your third number:");
            num3 = keyboardIn.nextInt();
            //Display prompt asking the user if they want to change the number
            System.out.println("Do you want to keep your numbers:");
            close = keyboardIn.next().charAt(0);
         }

         
         while(close == 'N'|| close == 'n')
         {
            //Display num1
            System.out.println("Number 1:" + num1);
            //Display num2
            System.out.println("Number 2:" + num2);
            //Display num3
            System.out.println("Number 3:" + num3);
         }  
         
       } //end main method

} //end class



         
            
