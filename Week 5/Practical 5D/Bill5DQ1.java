// Practical 5D - Question 1
// Oisin - L00172671
// 1.11.2022
// Cal moblie phone bill
import java.util.Scanner;
public class Bill5DQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      char type;
      double texts, payments, data, cost, fcost;
      
      //Display prompt asking user to enter the plan type
      System.out.print("Please enter your plan type:");
      type = keyboardIn.next().charAt(0);
      //Get number of texts sent
      System.out.print("Please enter the number of texts sent:");
      texts = keyboardIn.nextDouble();
      //Get data
      System.out.print("Please enter your data usage:");
      data = keyboardIn.nextDouble();
      
         //Display plan type D
         if (type == 'D' || type == 'd' && texts > 100)
         {
            //Set monthly payments
            payments = 25;
            //Peform cal to get text cost
            cost = (texts  - 100) * 0.07;
            //Display text cost
            System.out.print("Text cost:\t" + cost);
         }
         //Display data plan T
         else if (type == 'T' || type == 't' && data > 10) 
         {
            //Set payments
            payments = 20;
            //Peform cal to work out cost
            cost = (data - 10) * 0.1;
            //Display data cost
            System.out.print("Data cost:\t" + cost);
         }
         {
            System.out.print("Monthly payment: "+ cost);
         }
                
                         
          } //end main method

} //end class


         
         
            
            
            
            

      
      
