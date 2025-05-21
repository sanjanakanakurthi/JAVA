package DAY_6;
public class Demo1 extends Object {
	int a=89;
	void add() {
		System.out.println(a);
	}
	void sub() {
		int a=89;
		System.out.println(this.a);
		this.add();
		}
	//local variables can't access

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.sub();
		
	}

}
