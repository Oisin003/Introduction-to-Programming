//Practical 7C - Question 1
// Oisin - L00172671
//17.11.2022
//Program to calculate the average

import java.util.Scanner;
public class Average7CQ1
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      double value1, value2, value3, value4, average;
      
      //GET value 1
      System.out.println("Please enter value1:");
      value1 = keyboardIn.nextDouble();
      //GET value 2
      System.out.println("Please enter value2:");
      value2 = keyboardIn.nextDouble();
      //GET value 3
      System.out.println("Please enter value3:");
      value3 = keyboardIn.nextDouble();
      //GET value 4
      System.out.println("Please enter value4:");
      value4 = keyboardIn.nextDouble();
      
      do{  
            if( value1 != -1 || value2 != -1 || value3 != -1 || value4 != -1)
            { //Peform Cal
            average = value1 + value2 + value3 + value4 / 4;
            //Display average
            System.out.println("average is" +average);
            }
            if( value1 == -1 || value2 == -1 || value3 == -1 || value4 == -1)
            {
               //Display messgae on screen
               System.out.println("End");
            }
         }while(value1 != 5);
         
        } //end main method

} //end class


