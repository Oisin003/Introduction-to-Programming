// Practical 7B - Question 6
// Oisin - L00172671
// 17.11.2022
// Program to test mobile phone pin

import java.util.Scanner;

public class PhonePin7BQ6
{
   public static void main(String[] args) 
{
    final double PASSWORD = 1234;
    Scanner sc = new Scanner(System.in);
    //Declare variables
    double attempts = 3;
    String password = "1234";
    while (attempts-- > 0 && !PASSWORD.equals(1234))     {
        //Display prompt
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        if (password.equals(1234)) 
        
            //Display message
            System.out.println("Welcome");
        else 
         //Display message
            System.out.println("Wrong attempts remaining: " + attempts);        
    }
} 
}
     
      
