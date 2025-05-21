package DAY_7;

public class Demo11 extends Thread {

	public static void main(String[] args) {
		Demo11 d1=new Demo11();
		Demo11 d2=new Demo11();
		Demo11 d3=new Demo11();
		Demo11 d4=new Demo11();
		Demo11 d5=new Demo11();
		
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		System.out.println(d3.getName());
		System.out.println(d4.getName());
		System.out.println(d5.getName());
	}

}
