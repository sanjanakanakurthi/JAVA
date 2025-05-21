package DAY_7;
import java.util.*;
public class Demo7 {
	void add(int a,int b) throws ArithmeticException,InputMismatchException {
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		try {
		Demo7 t = new Demo7();
		t.add(23,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		

}
}