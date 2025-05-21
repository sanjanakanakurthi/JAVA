package DAY_3;
abstract class Test500{
	abstract void show1();
	static void show2() {
		System.out.println("hi");
	}
	static void show3() {
		System.out.println("hello");
	}
	void show4(){
		System.out.println("hru");
	}
	void show5() {
		System.out.println("gd evng");
	}
}
class teextends Test500{
	public void show1() {
		System.out.println("gm");
	}
	void show6() {
		System.out.println("ga");
	}
}
public class Test500 {

	public static void main(String[] args) {
		Test500 t=new Test500();
		t.show1();
		t.show4();
		t.show5();
		test5.show2();
		test5.show3();

	}

}
