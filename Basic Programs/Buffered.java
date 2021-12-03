//Program no.03 - Java Program to read an input from Java Console- Using BufferedReader.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Buffered{
    public static void main(String args[])
    throws IOException{
     BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a String : ");
     String name= sc.readLine();
     System.out.println("You have Entered : "+ name);
    }
}