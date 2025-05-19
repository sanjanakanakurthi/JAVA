package NRCM1;
interface I13{
	void add();
}
interface I29{
	void sub();
}
interface I30{
	void mul();
}
public class Demo4 implements I13,I29,I30{
	public void add() {
		System.out.println("get");
	}
	public void sub() {
		System.out.println("set");
	}
	public void mul() {
		System.out.println("go");
	}
	public void div() {
		System.out.println("finish");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 t=new Demo4();
		t.add();
		t.sub();
		t.mul();
		t.div();

	}

}