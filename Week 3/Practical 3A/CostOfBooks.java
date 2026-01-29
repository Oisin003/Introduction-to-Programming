//Pratical 3A - Question 4
// Oisin - L00172671
// 11.10.2022
// Program to calculate cost of books

import java.util.Scanner;
public class CostOfBooks
 {

   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Assign variables
      double book1, book2, book3, totalcost, net, discount, answer;
      
      //Display prompt which asks user to enter the value of the books
      System.out.println("Please enter the value of the first book: ");
      book1 = keyboardIn.nextDouble();
      System.out.println("Please enter the value of the second book: ");
      book2 = keyboardIn.nextDouble();
      System.out.println("Please enter the value of the third book: ");
      book3 = keyboardIn.nextDouble();
      
      //peform cal to work out totalcost
      totalcost = (book1 + book2 + book3);
              
         //Assign if variable  
         if ( totalcost > 50)
         {
         //peform cal to work out total cost owing after a 10% discount has been applied
         discount = 0.1;
         net = totalcost * discount;
         answer = totalcost - net;
         
         //Display total cost owing on screen
         System.out.println("Your total cost owing is: " + totalcost);
         System.out.println("Your total cost owing with discount is: " + answer);
         
         }
         //Assign variable to less than 100
         if (totalcost < 100)
         {
         //Display total cost owing on screen
         System.out.print("Your total cost owing is: " + totalcost);
         }
         
         //
            
   } //end main method

} //end class




