package DAY_4;

public class Demo6 {
	int a=90;
	public void add() {
		System.out.println("add");
		
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		Demo6 d1=new Demo6();
		d1.sub();
	}

}
