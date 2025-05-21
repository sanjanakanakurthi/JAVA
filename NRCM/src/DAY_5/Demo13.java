package DAY_5;
class Sample34{
	public Sample34() {
		System.out.println("good evening");
	}
	int x=100;
	void print() {
		System.out.println("hello");
	}
}
public class Demo13 extends Sample34{
	public Demo13() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Demo13 d1=new Demo13();
		d1.show();
		

	}

}
