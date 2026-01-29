// Practical 9B - Question1 
// Oisin - L00172671
// 1.12.2022
// Program implement given code

//DO
//GET age of person
//IF age of person is over 18
//ADD 10 to total price
//ElSE IF person is under 18
//ADD 5 to total price
//WHILE there is another person in the group
//DISPLAY total price

import java.util.Scanner;
public class Age9BQ1
{
   public static void main(String[ ] args)
   {
   
 Scanner keyboardIn = new Scanner(System.in);

    //Declare variables
    int age, people, total = 0;
    
    //Get user input
      System.out.println("How many people are in the group");
      people = keyboardIn.nextInt();

    do{//Open do
      
      //Get user input
      System.out.println("Please enter the persons age");
      age = keyboardIn.nextInt();
               if(age >= 18)
         {//open if
            total = total + 10;
         }//close if
         else if(age > 18)
         {//Open else if
            total = total + 5;
         }//close else if
      }while(people > 1);
      
      //Display total price
      System.out.println("Totalprice:" + total);
      
      }// end main method
}//end class

