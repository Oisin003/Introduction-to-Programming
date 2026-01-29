// CA-2
// Oisin -L00172671
// 8.12.2022
// Program to take user input

/*
Display menue to screen
Get user input
Add each option chosen by the user to the total 
Peform Cal to work out total
Display total
If user is under 18 and chooses beer then display text to screen
If user enters 0 end order 
Display thank  you message at program end
*/

//Delcare scanner
import java.util.Scanner;
//Delcare public class
public class classAssement2
{//open
   public static void main(String[ ] args)
   {//close
      //Import scanner
      Scanner keyboardIn = new Scanner(System.in);
      
       //Declare variables
       double choice,coke=2.55,crisps=0.95,beer=4.22,total = 0, age=0;
       
       //Get user input
           System.out.println("Please enter your age");
           age = keyboardIn.nextDouble(); 
           
       do{//open do
            
            //Display menu
            System.out.println("Menue");
            
            //Display menu on screen 
            System.out.println("Option 1 Coke - 2.55 ");
           
            //Display option 2
            System.out.println("Option 2 Crisps - 0.95");
            
            //Display option 3
            System.out.println("Option 3 Beer - 4.22");
            
            //Display exit
            System.out.println("Enter 0 to exit");            
           
           //Get user input
           System.out.println("Please enter your order");
           choice = keyboardIn.nextDouble(); 
           
            if(choice == 1)
            {//open
               total = total + coke;
            }//close
            else if(choice == 2)
            {//open else if
               total = total + crisps;
            }//close
            else if(choice == 3 && age >= 18)
            {//open else if
              total = total + beer;
            }//close else if  
            else if(choice == 3 && age < 18)
            {//open else if
               System.out.println("Customer must be over 18 to order beer");
            }//close else if
       
           }while(choice != 0);
             
         //Display text 
         System.out.println("Thank you for ordering");
              
         //Display total
         System.out.println("Total:" +total );
         
     }// end main method
}//end class

