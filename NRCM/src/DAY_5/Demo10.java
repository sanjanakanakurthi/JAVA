package DAY_5;
interface I1{
	abstract void add();
		void sub();
	}

public class Demo10 implements I1 {
	public void add() {
		System.out.println("sanjana");
	}
	public void sub() {
		System.out.println("kanakurthi");
	}

	public static void main(String[] args) {
		Demo10 t1=new Demo10();
		t1.add();
		t1.sub();
	}

}
