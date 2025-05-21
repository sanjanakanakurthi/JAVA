package DAY_3;
	abstract class test1{
		abstract void display();
		abstract void show();
	}
	public class Test300 extends test1 {
		public void display() {
			System.out.println("java is a high level language,invented by guido vanrossum in the year 1995,suntechsystems");
		}
		public void show() {
			System.out.println("i have learnt about jvm,wrapperclass,strings,arrays");
		}
		public static void main(String[] args) {
			Test300 d1=new Test300();
			d1.display();
			d1.show();
		}

	}
