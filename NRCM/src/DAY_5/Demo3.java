package DAY_5;
class fruits{
	void benifits() {
		System.out.println("healthy");
	}
}
class Apple extends fruits{
	void color() {
		System.out.println("Red");
	}
	
}
class Mango extends fruits{
	void sweet() {
		System.out.println("Tasty");
	}
}
class Berry extends fruits{
	void price() {
		System.out.println("100 per box");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Mango m1=new Mango();
		Berry b1=new Berry();
		a1.benifits();
		a1.color();
		m1.sweet();
		b1.price();
		
	}

}
