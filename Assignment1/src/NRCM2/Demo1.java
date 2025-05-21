package NRCM2;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer as a string: ");
	String input=sc.next();
	try {
		int number=Integer.parseInt(input);
		System.out.println("Parsed integer: "+ number);
	}catch(NumberFormatException e) {
		System.out.println("Error: The input is not a valid integer.");
		
	}
	finally {
		sc.close();
	}
	}

}
