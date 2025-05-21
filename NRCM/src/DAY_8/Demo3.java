package DAY_8;

public class Demo3 {


	public class Demo3 implements Runnable{
		public void run() {
			System.out.println("hii");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Demo3 d1=new Demo3();
			Thread d2=new Thread(d1);
			System.out.println("heloo");
			d2.start();

		}

	}
}
