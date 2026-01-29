//Practical 11A - Question 2
//Oisin - L00172671
//13.12.2022
//Program to that allows the user to search an array of six lotto numbers for a particular value

//Initalise  array with 6 numbers
//Prompt user to enter a value
//If user input is equal to value display value position
//If input is not equal to value display error message


import java.util.Scanner;

public class lottoNumbers11AQ2
{//OPEN

   public static void main(String[ ] args)
   {//OPEN
   
     Scanner keyboardIn = new Scanner(System.in);

     //Declare variables
     int searchValue;
     
     int position = -1; //assume not found
     
     //Get user input
     System.out.print("Enter the value to search for: ");
     searchValue = keyboardIn.nextInt();
     
     int[] lottoNumbers = {10,19,47,14,36,5};
                  
            for(int i = 0; i < lottoNumbers.length; i++)
                     {
                     if(lottoNumbers[i] == searchValue) //if match found
                     {
                     position = i; //store position
                     }
                    
                     }
                     if(position != -1) //if value of position has changed
                     {//open
                     
                     System.out.print("Value found at position: " + position);
                     
                     }//close
                     
                     else
                     {//open
                     
                      System.out.print("Value NOT found ");
                      
                     }//close    
                                        
                   }//close
                  
               }//close   
                     
                                 
                                
                              