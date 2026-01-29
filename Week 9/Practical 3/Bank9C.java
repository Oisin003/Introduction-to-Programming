// Practical 9C
// Oisin-L00172671
// 2.12.2022
// Program to run student bank

import java.util.Scanner;
public class Bank9C
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      double choice, bal = 0.00, deposit, withdraw,amount,repay,total;
      int i=0;
      
         do{//open do
            //Display option 1
            System.out.println("Enter 1 to view balance");
            //Display option 2
            System.out.println("Enter 2 to make a deposit");
            //Display option 3
            System.out.println("Enter 3 to make a withdrawal");
            //Display option 4
            System.out.println("Enter 4 to wiew transactions");
            //Display option 5
            System.out.println("Enter 5 to see how much a loan would cost");
            //Display option 6
            System.out.println("Enter 6 to exit");
            //Get user input
            System.out.println("Please enter your option:");
            choice = keyboardIn.nextDouble();
            
               if(choice == 1)
               {//open if
                  ++i;
                  //Display balance
                  System.out.println("Balance:" + bal);
               }//close if
               else if(choice == 2)
               {//open else if
                  ++i;
                  //Get user input
                  System.out.println("Please enter the amount you wish to deposit:");
                  deposit = keyboardIn.nextDouble();
                  //Peform CAL
                  bal = bal + deposit;
               }//close else if
               else if( choice == 3 && bal > 0)
               {//Open else if
                  ++i;
                  System.out.println("Please enter the amount you wish to withdraw:");
                  withdraw = keyboardIn.nextDouble();
                  //Peform CAL
                  bal = bal - withdraw;
               }//close else if
               else if(choice == 3 && bal < 0)
               {//opel else if
                  ++i;
                  //Display text
                  System.out.println("Insufficent funds");
               }//close else if
               else if(choice == 4)
               {//Open else if
                  //Display text
                  System.out.println("Total transactions:" + i);
               }//Close else if
               else if(choice == 5)
               {//open else if
                  ++i;
                  //Get user input
                  System.out.println("Please enter loan amount:");
                  amount = keyboardIn.nextDouble();
                  //Get user input
                  System.out.println("Over how many months will you be paying back this laon:");
                  repay = keyboardIn.nextDouble();
                  //Peform CAL
                  total = amount * 0.5 / repay;
                  //Display text
                  System.out.println("Repayment:" +total);
               }//close else if
            }while(choice != 6);
           }// end main method
}//end class

                  
            
            
            
            
