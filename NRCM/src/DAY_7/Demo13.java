package DAY_7;

public class Demo13  extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo13 d=new Demo13();
		Thread t1=new Thread();
		t1.start();
		System.out.println("good night");
		try {
			t1.sleep(20000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hellooo");

	}

}
