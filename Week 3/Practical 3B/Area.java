// Practical 3B - Question 5
// Oisin - L00172671
// 13.10.2022
// Program to cal area of a triangle and circle

import java.util.Scanner;
public class Area
{
   public static void main(String[ ] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
        
      int length, height,area1, area2, t ,r;
          
  
     t = area1;
     area1 = (height * length)/2;
    r = area2;
   area2 = height* length;
    
     
     
                            
      //Display prompt asking user to enter length and height and either T or R
      System.out.println("Please enter the length: ");
      length = keyboardIn.nextInt();
      System.out.println("Please the height: ");
      height = keyboardIn.nextInt();
      System.out.println("Please enter for triangle or r for rectangle: ");
      t = keyboardIn.nextInt();
      r = keyboardIn.nextInt();
   
       
       if (t == area1)
         
         {
         //Peform cal to work out area of a triangle
         area1 = (height * length)/2;

         //Display area of a triangle
         System.out.println("The area of a triangle is: " + area1);
         }
         
         else      
          {
         //Peform cal to work out area of a rectangle
                  //Display area of a rectangle on screen
         System.out.println("The area of a rectangle is: " + area2);
         }
  
  
  
   } //end main method

} //end class






      
