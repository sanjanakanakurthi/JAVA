package DAY_7;

public class Demo12 extends Thread {

	public static void main(String[] args) {
		Demo12 d=new Demo12();
		Thread t=new Thread(d);
		System.out.println(d.getName());
		System.out.println(d.getState());
		Thread t1 = new Thread(d);
		t1.start();
		System.out.println(t1.getName());
	}

}
