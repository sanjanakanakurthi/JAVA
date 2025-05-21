package DAY_6;
class Test1{
	//final void show(){
	 void Show() {
		System.out.println("hi");
	}
}
public class Dem03 extends Test1 {
	void Show() {
		int a=34;
		System.out.println(a);
		a=23;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Dem03 d1=new Dem03();
		d1.Show();
	}

}
