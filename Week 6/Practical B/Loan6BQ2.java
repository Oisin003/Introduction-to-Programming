// Practical 6B - Question 2
// Oisin - L00172671
// 8.11.2022
// Program to work out a loan

import java.util.Scanner;
public class Loan6BQ2
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      char type;
      int amount, repayment;
      
      //Get laon amount
      System.out.print("Please enter the loan amount:");
      amount = keyboardIn.nextInt();
      //Get loan type 
      System.out.print("Please enter the loan type:");
      type = keyboardIn.next().charAt(0);
      
      //Run switch
      switch(type)
      {//open switch
         case 'A':
         case 'a':
            System.out.print("Interest:10%");
            //peform cal 
            repayment = (amount/10) + 1 * amount;
            //Display repayment
            System.out.print("Repayment due:" + repayment);
               break;
         case 'K':
         case 'k':
         //Display interest
            System.out.print("Interest:5%");
            //peform cal 
            repayment = (amount/5) + 1 * amount;
            //Display repayment
            System.out.print("Repayment due:" + repayment);
               break;
            case 'M':
            case 'm':
               //Display interest
               System.out.print("Interest: 4%");
               //Peform cal
               repayment = (amount/4) + 1 * amount;
               //Display repayment
               System.out.print("Repayment due:" +repayment);
                  break;
               case 'P':
               case 'p':
                  //Display interest
                  System.out.print("Interest: 5%");
                  //Peform cal
                  repayment = (amount/5) + 1 * amount;
                  //Display repayment
                  System.out.print("Repayment due:" + repayment);
                        break;
                  case 'Z':
                  case 'z':
                     //Display interest
                     System.out.print("Interest: 10%");
                     //Peform cal
                     repayment = (amount/10) + 1 * amount;
                     //Display repayment
                     System.out.print("Repayment due:" + repayment);
                        break;
                     default: System.out.print("Invaild entry");
            }//end switch
            
            } //end main method

} //end class


     
