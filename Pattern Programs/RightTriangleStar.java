// Pattern Progrm 11 - Java Program to Print Right Triangle Star Pattern.
import java.util.*;
public class RightTriangleStar{
    static void PrintPattern(int n){
        // i handle Rows
       for(int i=n; i>=0; i--) {
          // j handle Columns
         for(int j=0; j<=i; j++){
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