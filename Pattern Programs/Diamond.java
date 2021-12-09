// Pattern Program 09 - Java Program to Print Diamond Pattern. - Using For Loop.
import java.util.*;
public class Diamond{
    static void PrintPattern(int n){
         for(int i=1; i<=n; i++) {
         
          // j handle white spaces
         for(int j=0; j<n-i; j++){
            // First number Spaces
             System.out.print(" ");
             // Space between Numbers
             System.out.print(" ");
         }
         // Pyramid Printing
        
          for(int j=1; j<=(2*i-1); j++){
             System.out.print("*" +" ");
         }
        
         System.out.println(); 
      } 
        // i handle Rows
      for(int i=n; i>=1; i--) {

         for(int j=0; j<n-i; j++){
            // First number Spaces
             System.out.print(" ");
             // Space between Numbers
             System.out.print(" ");
         }
         // Pyramid Printing
          // Pyramid Printing
          for(int j=1; j<=(2*i-1); j++){
             System.out.print("*" +" ");
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