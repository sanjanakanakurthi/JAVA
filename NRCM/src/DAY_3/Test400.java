package DAY_3;
abstract class Test400{
	abstract void add();
	abstract void sub();
	}
public class Demo16 extends Test4{
	public void add() {
		System.out.println(3+6);
	}
	public void sub() {
		System.out.println(8-9);
	}
	static void mul() {
		System.out.println(5*4);}
	void mod() {
		System.out.println(5%4);
	}
	void div() {
		System.out.println(4/7);
	}
	public static void main(String[] args) {
		Demo16 d1=new Demo16();
		d1.add();
		d1.sub();
		Demo16.mul();
		d1.mod();
		d1.div();
	}
}