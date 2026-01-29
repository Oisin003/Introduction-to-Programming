// Practical 5A - Question 3
// Oisin - L00172671
//25.10.2022
// Program  to determine a vowel

import java.util.Scanner;
public class Vowels5AQ3
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      char vowel;
      //Display prompt asking user to enter a single charater
      System.out.print("Please enter a character:");
      vowel = keyboardIn.next().charAt(0);
      
         //Display switch ststement on screen to determine if the character is a vowel
         switch(vowel)
         {
               case 'A':
               case 'a':
                     System.out.print(vowel + "\t is a vowel");
                     break;
               case 'E':
               case 'e':
                     System.out.print(vowel + "\t is a vowel");
                     break;
               case 'I':
               case'i':
                     System.out.print(vowel + "\t  is a vowel");
                     break;
               case 'O':
               case 'o':
                     System.out.print(vowel + "\t is a vowel");
                     break;
               case 'U':
               case 'u':
                     System.out.print(vowel + "\t is a vowel");
                     break;
               default: System.out.print(vowel  + "\t is NOT a vowel");
            }//end switch
         
          } //end main method

} //end class


               
               
               
                  