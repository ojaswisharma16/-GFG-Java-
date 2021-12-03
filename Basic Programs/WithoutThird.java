//Program no.06 - Java Program to Swap Two Values - Without Using Third Variable.
import java.util.*;
public class WithoutThird{
     static void SwapWithoutThirdVariable(int m, int n){
        m=m-n;
        n=m+n;
        m=n-m;
         System.out.println("New Value of m is : "+m);
        System.out.println("New Value of n is : "+n);
     }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Value of m :");
        int m= sc.nextInt();
        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();
        SwapWithoutThirdVariable(m,n);
        
    }
}