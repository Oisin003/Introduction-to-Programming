// Practical 7B - Question 7
// Oisin - L00172671
// 17.11.2022
// Program to test mobile phone pin

import java.util.Scanner;

public class PhonePin7BQ7
{
   public static void main(String[ ] args)
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      
      //Declare variables
      int guess=0,num;
      final int PIN = 1234;
      //Display message
      System.out.println("4 digit pin, ie:1234");
      //Display prompt on screen
      System.out.println("Enter the phone pin");
      num = keyboardIn.nextInt();
      
      do{
      if(num != PIN)
      guess++;
      {//open
         //Display message
         System.out.println("Try again");
         System.out.println("Enter the phone pin");
         guess = keyboardIn.nextInt();
      }//close
     
         }while( num != guess );//close
      
      
      if(num == PIN)
      {//open
         //Display message
         System.out.println("Congrats");
         //Display guesses
         System.out.println("Total Guesses"+ guess++);
      }

    } //end main method

} //end class
         
      
      
      
      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
       
     // int attemps = 0;
//Scanner keyboard = new Scanner(System.in);
//System.out.print("Enter Pin Code: ");
//String PUK = null;
//String CORRECT_PIN = "0123";
//String CORRECT_PUK = "01234";
//do{
        //PIN  = keyboard.next();
       // attemps++;
        //if (!PIN.equals(CORRECT_PIN) && attemps < 3) 
           // { 
              // System.out.println("PIN is incorrect! Try again!" );
            //}
     //}while(!PIN.equals(CORRECT_PIN) && attemps < 3);
           // if (PIN.equals(CORRECT_PIN) && attemps <= 3) {  
               // System.out.println("Welcome!");  
           // }
            // else {
              // System.out.println("PIN is incorrect! Try again with PUK");
               //attemps = 0;
             //  }
           // do{
               // PUK  = keyboard.next();
               // attemps++;
                //if (!PUK.equals(CORRECT_PUK) && attemps < 3) 
                   // { 
                      // System.out.println("PIN is incorrect! Try again!" );
                   // }
            // }while(!PUK.equals(CORRECT_PUK) && attemps < 3);
            //if (PUK.equals(CORRECT_PUK) && attemps <= 3) {  
              //  System.out.println("Welcome!");  
            //}
            //else
            //{
              // System.out.println("PUK is incorrect! SIM Blocked! See you!");
            //}
            //}
            //}
