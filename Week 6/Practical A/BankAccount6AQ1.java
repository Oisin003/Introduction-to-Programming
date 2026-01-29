// Practical 6A
// Oisin - L00172671
// 8.11.2022
// Program to read and display bank info

import java.util.Scanner;
public class BankAccount6AQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      // Declare variaables
      double curbal, tran, newBal, interest, fee;
      char account;
      
      //GET account type
      System.out.print("Please enter your account type:");
      account = keyboardIn.next().charAt(0);
      //GET account balance
       System.out.print("Please enter your account Balance:");
       curbal = keyboardIn.nextDouble();
       //GET transactions
       System.out.print("Please enter total transactions:");
       tran = keyboardIn.nextDouble();
       
         //START if statements
         if (account == 's' || account == 'S')
         {//open if
            if (curbal > 100)
            {  
               //Peform Cal
               interest = curbal * 0.4;
               //Display interest
                System.out.println("Interest:"+interest);
            }

            
            {
               //Display account type
               System.out.println("Account type:" + account);
            }
            
            if(curbal < 100)
            {
               //Peform Cal
               newBal = curbal - 10;
               //Display new bal
               System.out.println("New Balance:"+newBal);
            }
            
          }//close if
         
                     
        if (account == 'c' || account == 'C')
        {//open if
            if( curbal > 100)
            {
               //Peform Cal 
                interest = curbal * 0.05;
                //Display interest on screen
                System.out.println("Interest:"+interest);
            }
            

           {
                //Diplay account type
               System.out.println("Account type:" + account);
            }
             
            if(curbal >= 6000)
           {
               //Peform Cal 
               interest = curbal * 0.03;
               //Display interest on screen
               System.out.println("Interest:"+interest);
            }
            
            else if (curbal < 100)
            {
               //Peform cal
               newBal = curbal - 25;
               //Display new bal
               System.out.println("New Balance:" + newBal);
            }
            
            else if(curbal > 100 && tran <= 50)
            {
               System.out.println("No fees");
            }
            
            else if( curbal > 100 && tran > 50 || tran <= 100)
            {
               //Peform Cal
               fee = tran * 0.20;
               //Display fee
               System.out.println("Fees:" + fee);
            }
            
            else if( tran > 100)
            {
               //Peform Cal
               fee = tran * 0.10;
               //Display fees
               System.out.println("Fees:" + fee);
            }
            
         }//close if
                     
       } //end main method

} //end class


               
            

               
                        
               
            


      

      
      