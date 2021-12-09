// Pattern Program 07 - Java Program to Print Reverse Star Pyramid Pattern. - Using While Loop.
import java.util.*;
public class ReversePyramidWhile{
    static void PrintPattern(int n){
        int i=n , j;
      while(i>0){
          j=0;
          while(j++<n-i){
              System.out.print(" ");
          }
            j=0;
          while(j++<(i*2)-1){
              System.out.print("*");
          }
          System.out.println();
          i--;
      }
    }
    
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter Number of Rows : ");
     int n= sc.nextInt();
     PrintPattern(n);
    }
}