package DAY_6;
//final class Test2{
class Test2{
	  void Show() {
		System.out.println("hi");
	}
}
public class Demo4 extends Test2 {
	void Show() {
		int a=34;
		System.out.println(a);
		a=23;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Demo4 d1=new Demo4();
		d1.Show();
	}

}
