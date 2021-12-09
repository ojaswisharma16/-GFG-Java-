// Pattern Program 08 - Java Program to Print Reverse Star Pyramid Pattern. - Using do While Loop.
import java.util.*;
public class ReversePyramidDoWhile{
    static void PrintPattern(int n){
        int i=n , j;
      do{
          j=0;
         do{
              System.out.print(" ");
          } while(j++<n-i);
            j=0;
          do{
              System.out.print("*");
          }while(j++<(i*2)-2);
          System.out.println();
      }while(--i>0);
    }

    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter Number of Rows : ");
     int n= sc.nextInt();
     PrintPattern(n);
    }
}