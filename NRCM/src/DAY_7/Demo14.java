package DAY_7;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("enter the class name ");
			String className = s.next();
			Class.forName(className);
			System.out.println("the class found ");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}