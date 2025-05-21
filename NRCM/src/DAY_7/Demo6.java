package DAY_7;
import java.util.*;
public class Demo6 {
	void add() throws ArithmeticException,InputMismatchException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Demo6 t = new Demo6();
		t.add();
	
		

}
}