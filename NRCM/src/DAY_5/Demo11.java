package DAY_5;
interface I21{
	void add();
	}
interface I23{
	void sub();
	}
public class Demo11  implements I21,I23{
	public void add() {
	System.out.println("hi");
}
	public void sub() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Demo11 t1=new Demo11();
		t1.add();
		t1.sub();

	}

}
