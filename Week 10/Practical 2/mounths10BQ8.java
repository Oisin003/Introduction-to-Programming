// Practical 10B - Question 8
// Oisin - L00172671
// 25.10.2022
// Program to  assign and display mounths

import java.util.Scanner;
public class mounths10BQ8
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int months;
      
           
      String month [] = {"January", "Feduary", "March", "April", "March", "May", "June", "July", "August", "September", "October", "November", "December"};
     
     //Display prompt on screen asking the user to enter a month
      System.out.print("Please enter a month (1-12):");
      month = keyboardIn.nextInt();

      for(int i = 0; i < month.length; i++)
      {//open for
      
         //Print days of the month
         System.out.println("The month is:" + month[i]);
         
         //Displayswitch statement on screen to determine which season the mont will be in
         switch(months)
         {  
               case 1:
                     System.out.print("31");
                     break;
               case 2: 
                     System.out.print("28");
                     break;
               case 3: 
                     System.out.print("31");
                     break;
               case 4: 
                     System.out.print("30");
                     break;
                     case 5: 
                     System.out.print("31");
                     break;
                     case 6: 
                     System.out.print("30");
                     break;
                     case 7: 
                     System.out.print("31");
                     break;
                     case 8: 
                     System.out.print("31");
                     break;
                     case 9: 
                     System.out.print("30");
                     break;
                     case 10: 
                     System.out.print("31");
                     break;
                     case 11: 
                     System.out.print("30");
                     break;
                     case 12: 
                     System.out.print("31");
                     break;
               default: System.out.print("Invalid");
            }//end switch
         }//close for
          } //end main method

} //end class

               
      
      

