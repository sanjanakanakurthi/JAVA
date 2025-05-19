package NRCM1;
interface Vegetables{
	void vegetables();
}
interface fruits{
    void Fruits();
	
}
class Test1{
	void leafy() {
		System.out.println("leafy veggies are:palak,mint,spinach");
	}
}
class Test2 extends Test1 implements Vegetables,fruits{
	public void healthy() {
		System.out.println("healthy food are:carrot ,beetroot,brocoli");
	}
	public void vegetables() {
		System.out.println("veggies are:tomato,potato,bottleguard");
	}
	public void Fruits() {
		System.out.println("fruits are:mango,apple,banana");
	}
}
class Test3 extends Test2{
	public void cost() {
		System.out.println("One month cost are: 1500");
	}
}

public class Demo5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		t2.healthy();
		t2.leafy();
		t2.vegetables();
		t2.Fruits();
		t1.leafy();
		t3.cost();
		t3.healthy();

	}

}