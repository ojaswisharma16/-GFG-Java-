// Program no.05 - Java Program to Swap Two Values - Using Third Variable.
import java.util.*;
public class UsingThird{
    static void SwapUsingThirdVariable(int m, int n){
        int temp=m;
        m=n;
        n=temp;
        System.out.println("New Value of m is : "+m);
        System.out.println("New Value of n is : "+n);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Value of m :");
        int m= sc.nextInt();
        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();
        SwapUsingThirdVariable(m,n);
    }
}