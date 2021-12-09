// Pattern Program 06 - Java Program to Print Reverse Star Pyramid Pattern. - Using For Loop.
import java.util.*;
public class ReverseStarPyramid{
    static void PrintPattern(int n){
        // i handle Rows
      for(int i=n; i>=1; i--) {

         for(int j=0; j<n-i; j++){
            // First number Spaces
             System.out.print(" ");
             // Space between Numbers
             System.out.print(" ");
         }
         // Pyramid Printing
         
          for(int j=1; j<=(2*i-1); j++){
             System.out.print("*");
         }
    
         System.out.println(); 
      } 
    }


    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter Number of Rows : ");
     int n= sc.nextInt();
     PrintPattern(n);
    }
}