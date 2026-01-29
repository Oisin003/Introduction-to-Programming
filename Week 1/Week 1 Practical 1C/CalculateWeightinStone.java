// Practical 1C -Question 6
// Oisin - L00172671
// 1.10.2022
// Program to find johns weight in stone

public class CalculateWeightinStone
{
public static void main(String[ ] args)
    
    {
          
      //Declare variable to hold Johns current weight in pounds
      int weightinpounds;
      //assign vaule to johns weight in pounds
      weightinpounds = 174;
      
      //Declare variable to hold stone
      int stone;
      //assign value to stone
      stone= 14;
      
      //Declare johns weight in stone
      int johnweightinstone;
      
      //peform cal
      johnweightinstone= weightinpounds / stone;
      
      //Declare variable to hold final weight
      int finalweight;
      
      //peform cal
      finalweight = johnweightinstone % weightinpounds;
      
      //Display answer on screen
      System.out.println("John weighs 174 pounds");
      System.out.print("Johns weight in stone is "+ finalweight);
      System.out.print(" stone");
   
   }
}