// Practical 9B - Question 3
// Oisin - L00172671
// 1.12.2022
// Program to take user input and display starts

import java.util.Scanner;
public class Bank9BQ5
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
    //Declare variables
    double withDraw, bal= 0.00, deposit, choice;
    int withdraw = 0, view = 0, dePosit = 0;
    do{//open do
         //Display menu on screen
         System.out.println("Option 1 withdraw ");
         //Display option 2
         System.out.println("Option 2 deposit");
         //Display option 3
         System.out.println("Option 3 view");
         //Display exit
         System.out.println("Enter 0 to exit");
        //Get user input
        System.out.println("Please enter your option");
        choice = keyboardIn.nextDouble();   
        
         if(choice == 1 && bal < 0)//withdraw
         {//open
            ++withdraw;
            //Get user input
            System.out.println("Enter your withdraw amount");
            withDraw = keyboardIn.nextDouble();
            bal = bal - withDraw;
         }//close
         else if(choice == 2)//deposit
         {//open else if
            ++dePosit;
            //Get user input
            System.out.println("Please enter your deposit amount:");
            deposit = keyboardIn.nextDouble();
            bal = bal + deposit;
         }//close
         else if(choice == 3)//view
         {//open else if
            ++view;
            //Display balance
            System.out.println("Your balance is:" + bal);
          }//close else if  
          else if(choice != 1 || choice != 2 || choice != 3 || choice != 0)
          {//open else
            System.out.println("Error");
         }//close else                 
        }while(choice != 0);
               
      //Display total
      System.out.println("Total:" +bal );
      //Display outputs
      System.out.println("Total withdraws" + withdraw);
      System.out.println("Total views" + view);
      System.out.println("Total deposits" + dePosit);
         
     }// end main method
}//end class
