
import java.util.Scanner;
public class sampleArray
{
   public static void main(String[ ] args)
   {
     Scanner keyboardIn = new Scanner(System.in);
     
  
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      int coinToss, countH=0, countT=0;
      
      Scanner scan = new Scanner(System.in);
      //Prompt user
      System.out.println("Please flip a coin  10 times: ");
      for(int i=0; i<10; i++)
      {
         num = scan.nextInt();
         if(coinToss == 'h' || coinToss == 'H')
            countH++;
         else if(coinToss == 't' || coinToss == 'T')
            countT++;
      }
      
      System.out.println("Total times coin landed on heads: " +countH);
      System.out.println("Total times coin landed on tails: " +countT);
   }
     
      
