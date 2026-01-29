//Practical 10A-Question 3
//Oisin - L00172671
//6.12.2022
//Program to declare and initalise the array of given prices

import java.util.Scanner;
public class Prices10AQ3
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     double[] price = new double[5];
     
         //Assigin values
         price[0] = 12.99;
         price[1] = 15.00;
         price[2] = 9.50;
         price[3] = 130.00;
         price[4] = 2.99;
         
         for(double i=(price.length); i <= 6;++i)
         {//open for
            //Display price 1
            System.out.println(+price[0]);
            //Display price 2
            System.out.println(+price[1]);
            //Display price 3
            System.out.println(+price[2]);
            //Display price 4
            System.out.println(+price[3]);
            //Display price 5
            System.out.println(+price[4]);
         }//close for
         
         } //end main method

} //end class


            
      
         
         
         
     
