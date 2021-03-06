// Pattern Program 03 - Java Program to Print Pyramid Pattern.
import java.util.*;
public class PyramidPattern{
    static void PrintPattern(int n){
        // i handle Rows
      for(int i=1; i<=n; i++) {
         
          int x=i-1;
          // j handle white spaces
         for(int j=0; j<n-i; j++){
            // First number Spaces
             System.out.print(" ");
             // Space between Numbers
             System.out.print(" ");
         }
         // Pyramid Printing
          for(int j=0; j<=x; j++){
             System.out.print((i+j) +" ");
         }
         // Starts Printing after 3 of Second Row
         for(int j=1; j<=x; j++){
             System.out.print((i+x-j) +" ");
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