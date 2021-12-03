//Program no.04 - Java Program to Multiply Two Floating Point Number.
import java.util.*;
public class MultiplyFloat{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Floating Point Integer : ");
        float a= sc.nextFloat();
        System.out.println("Enter Second Floating Point Integer : ");
        float b= sc.nextFloat();
        float product=a*b;
        System.out.println("Their Product is : "+product);

    }
}