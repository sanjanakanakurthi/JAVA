package DAY_4;
class Test1{
	private void add() {
		System.out.println("hi");
	}
public class Demo12 extends Test1{

	public static void main(String[] args) {
		Demo12 d1=new Demo12();
		d1.add();//we are trying to access private access thats we are not getting the output
	}
}
}


