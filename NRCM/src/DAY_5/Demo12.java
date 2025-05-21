package DAY_5;
interface I26{
	void add();
	}
class Test1{
	void sub() {
		System.out.println("hello");
	}
	}
public class Demo12 extends Test1 implements I26{
	public void add() {
	System.out.println("hi");
}
public static void main(String[] args) {
		Demo12 t1=new Demo12();
		t1.add();
		t1.sub();
}
}