//Practical 10A-Question 5
//Oisin - L00172671
//6.12.2022
//Program to declare and initalise to read and display prices

import java.util.Scanner;
public class MorePrices10AQ5
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     
            double[] price = new double[5];
            
            //Declare variables
            double total = 0, totalPrice= 0;          
            //Get Prices            
            System.out.println("Enter item costs: ");
            
            for(int i = 0; i < price.length; i++)
            {//open for
            
               System.out.print("Price" +(i+1)+": ");
               price[i] = keyboardIn.nextDouble();
                              
            }//close for
            //Display prices
            System.out.println("total");
            
            for(int i = 0; i < price.length; i++)
            {//open for
              totalPrice = price[i] * price.length; 
            }//close for
               
               //Display total
               System.out.println("Total Price:" +totalPrice);
            
                  
            

            
                       
           
            }//close
            }//close
                 


     
     
     
     
         