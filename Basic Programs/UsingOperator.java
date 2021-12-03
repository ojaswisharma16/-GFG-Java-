// Program no.07 - Java Program to Swap Two Values -Using Bitwise XOR Operator.
import java.util.*;
public class UsingOperator{
     static void SwapUsingXORoperator(int m, int n){
        m=m^n;
        n=m^n;
        m=m^n;
         System.out.println("New Value of m is : "+m);
        System.out.println("New Value of n is : "+n);
     }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Value of m :");
        int m= sc.nextInt();
        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();
        SwapUsingXORoperator(m,n);
        
    }
}